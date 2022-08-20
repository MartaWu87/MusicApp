package io.a10.musicapp.service;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Service
public class MusicAppService {
    private static EntityManagerFactory entityManagerFactory;

}
