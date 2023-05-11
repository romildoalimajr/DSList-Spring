package net.kalangos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.kalangos.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
