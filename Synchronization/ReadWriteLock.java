package Synchronization;

import java.util.concurrent.locks.Lock;

public interface ReadWriteLock {

  Lock writeLock();

  Lock readLock();

}
