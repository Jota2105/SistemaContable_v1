package com.sistema.cxc.negocio;

import com.sistema.cxc.modelo.Cobrador;
import javax.persistence.*;
import com.sistema.cxc.modelo.Log_JDAH;

import java.time.LocalDate;
import java.time.LocalTime;

public class NegocioLog_JDAH {

    private static final String PU = "SistemaContablePU";

    public void registrarAuditoriaJDAH(String actividadJDAH) {
        EntityManagerFactory emf = null;
        EntityManager em = null;
        try {
            emf = Persistence.createEntityManagerFactory(PU);
            em = emf.createEntityManager();
            em.getTransaction().begin();

            Log_JDAH objetoLogJDAH = new Log_JDAH();

            int idGenerado = (int) (System.currentTimeMillis() % 1000000);
            objetoLogJDAH.setIdLogJDAH(idGenerado);

            objetoLogJDAH.setActividadJDAH(actividadJDAH);
            objetoLogJDAH.setFechaJDAH(LocalDate.now());
            objetoLogJDAH.setHoraJDAH(LocalTime.now());

            em.persist(objetoLogJDAH);
            em.getTransaction().commit();

        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();


        } finally {
            if (em != null) em.close();
            if (emf != null) emf.close();
        }

    }
}
