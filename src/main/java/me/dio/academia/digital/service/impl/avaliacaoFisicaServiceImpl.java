package me.dio.academia.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;

@Service
public class avaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {
	
	@Autowired
	private AvaliacaoFisicaRepository repositoryAvaliacao;
	
	@Autowired
	private AlunoRepository repositoryAluno;
	
	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
		AvaliacaoFisica avaliacao = new AvaliacaoFisica();
		Aluno aluno = repositoryAluno.findById(form.getAlunoId()).get();
		
		avaliacao.setAluno(aluno);
		avaliacao.setPeso(form.getPeso());
		avaliacao.setAltura(form.getAltura());
		
		return repositoryAvaliacao.save(avaliacao);
	}

	@Override
	public AvaliacaoFisica get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AvaliacaoFisica> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
