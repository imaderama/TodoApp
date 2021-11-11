package id.ac.ubaya.informatika.todoapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import id.ac.ubaya.informatika.todoapp.R
import id.ac.ubaya.informatika.todoapp.databinding.FragmentCreateTodoBinding
import id.ac.ubaya.informatika.todoapp.databinding.FragmentEditTodoBinding
import id.ac.ubaya.informatika.todoapp.model.Todo
import id.ac.ubaya.informatika.todoapp.util.NotificationHelper
import id.ac.ubaya.informatika.todoapp.viewmodel.DetailTodoViewModel
import kotlinx.android.synthetic.main.fragment_create_todo.*

class CreateTodoFragment : Fragment(){
    private lateinit var viewModel:DetailTodoViewModel
    private lateinit var dataBinding: FragmentCreateTodoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_todo, container, false)
//        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_create_todo, container, false)
//        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(DetailTodoViewModel::class.java)
//        dataBinding.listener = this
//        dataBinding.radiolistener1 = this

        btnAdd.setOnClickListener {
            NotificationHelper(view.context).createNotification("Todo Created", "A new todo has been created! Stay focused!")
            val radio = view.findViewById<RadioButton>(radioGroup.checkedRadioButtonId)
            var todo = Todo(txtTitle.text.toString(), txtNotes.text.toString(), radio.tag.toString().toInt(), 0)
            var list = listOf(todo)
            viewModel.addTodo(todo)
            Toast.makeText(it.context, "Todo Created", Toast.LENGTH_SHORT).show()
            Navigation.findNavController(it).popBackStack()
        }
    }



//    override fun onButtonAddClick(v: View, obj: Todo) {
//        NotificationHelper(v.context).createNotification("Todo Created", "A new todo has been created! Stay focused!")
//        var todo = Todo(obj.title, obj.notes, obj.priority, 0)
//        var list = listOf(todo)
//        viewModel.addTodo(todo)
//        Toast.makeText(v.context, "Todo Created", Toast.LENGTH_SHORT).show()
//        Navigation.findNavController(v).popBackStack()
//    }
//
//    override fun onRadioButtonClick(v: View, priority: Int, obj: Todo) {
//        obj.priority = v.tag.toString().toInt()
//    }


}