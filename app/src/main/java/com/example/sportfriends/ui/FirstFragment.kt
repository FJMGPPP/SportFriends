package com.example.sportfriends.ui
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sportfriends.novedades.NovedadesAdapter
import com.example.sportfriends.databinding.FragmentFirstBinding
import com.example.sportfriends.novedades.model.NovedadModel
import com.example.sportfriends.novedades.viewmodel.NovedadesViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {


    // This property is only valid between onCreateView and
    // onDestroyView.
    private var _binding : FragmentFirstBinding? = null
    private val novedadViewModel : NovedadesViewModel by viewModels()
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        novedadViewModel.model.observe(viewLifecycleOwner) { model -> initRecycleView(model) }
        novedadViewModel.getData()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initRecycleView(model : NovedadModel)
    {
        val recyclerView = binding.RecycleNovedades
        recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter = NovedadesAdapter(model)
    }
}