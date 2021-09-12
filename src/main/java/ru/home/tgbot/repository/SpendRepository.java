package ru.home.tgbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.home.tgbot.entity.Spend;


@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {
}