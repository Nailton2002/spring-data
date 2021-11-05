package br.com.alura.spring.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.spring.data.orm.Cargo;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer> {
//PRIMEIRO PARAMETRO É O OBJETO QUE QUERO FAZER UM REPOSITORY, E O SEGUNDO É O TIPO DO ID SE É INTEIRO, FLOAT E ETC...
}
