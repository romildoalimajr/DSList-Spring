package net.kalangos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.kalangos.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
