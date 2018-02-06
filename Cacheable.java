package shiva;

public interface Cacheable
{
public boolean isExpired();
public Object getIdentifier();
}