package id.ac.ubaya.informatika.todoapp.view

import android.icu.text.Transliterator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import id.ac.ubaya.informatika.todoapp.R
import id.ac.ubaya.informatika.todoapp.model.Todo
import kotlinx.android.synthetic.main.todo_item_layout.view.*

class TodoListAdapter(val todoList:ArrayList<Todo>, val adapterOnClick : (Any) -> Unit):RecyclerView.Adapter<TodoListAdapter.TodoListViewHolder>() {
    class TodoListViewHolder(var view:View):RecyclerView.ViewHolder(view)

    fun updateTodoList(newTodoList:List<Todo>){
        todoList.clear()
        todoList.addAll(newTodoList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.todo_item_layout, parent, false)

        return TodoListViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoListViewHolder, position: Int) {
        with(holder.view){
            checkTask.text = todoList[position].title

            imgEdit.setOnClickListener {
                val action = TodoListFragmentDirections.actionEditTodoFragment(todoList[position].uuid)
                Navigation.findNavController(it).navigate(action)
            }

            checkTask.setOnCheckedChangeListener { compoundButton, b ->
                compoundButton.isChecked = false
                adapterOnClick(todoList[position])
            }
        }

    }

    override fun getItemCount(): Int {
        return todoList.size
    }
}