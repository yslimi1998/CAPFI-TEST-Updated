package net.slimi.filmservice.entity;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import java.io.Serializable;

public class TconstGenerator implements IdentifierGenerator {

    private static long counter = 1L;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        String tconst = "tt" + String.format("%07d", counter++);
        return tconst;
    }
}

