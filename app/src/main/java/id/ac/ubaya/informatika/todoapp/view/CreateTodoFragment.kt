package id.ac.ubaya.informatika.todoapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import id.ac.ubaya.informatika.todoapp.R
import id.ac.ubaya.informatika.todoapp.databinding.FragmentCreateTodoBinding
import id.ac.ubaya.informatika.todoapp.model.Todo
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
        dataBinding.todo = Todo("","",3,0)
//        dataBinding.listener = this
//        dataBinding.radiolistener = this
//        dataBinding.listener = this
//        dataBinding.radiolistener1 = this

        btnAdd.setOnClickListener {

        }
    }

//    override fun onButtonAddClick(v: View) {
//        val myWorkRequest = OneTimeWorkRequestBuilder<TodoWorker>()
//            .setInitialDelay(10, TimeUnit.SECONDS)
//            .setInputData(workDataOf("TITLE" to "todo created", "MESSAGE" to "A new todo has been created! Stay focused!"))
//            .build()
//        WorkManager.getInstance(requireContext()).enqueue(myWorkRequest)
//        val radio =  v.findViewById<RadioButton>(radioGroupPriority1.checkedRadioButtonId)
//        var todo = Todo(txtTitle.text.toString(), txtNotes.text.toString(), radio.tag.toString().toInt(), 0)
//        var list = listOf(todo)
//        viewModel.addTodo(todo)
//        Toast.makeText(context, "Todo Created", Toast.LENGTH_SHORT).show()
//        Navigation.findNavController(v).popBackStack()
//    }

//    override fun onRadioButtonClick(v: View, obj: Todo) {
//        obj.priority = v.tag.toString().toInt()
//    }
}