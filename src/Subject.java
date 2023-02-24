public interface Subject{
    /**
     * Registra a un observador
     * @param o El observador a regresar
     */
    public void register(Observer o);
    /**
     * Quita el registro de un observador
     * @param o El observador a quitar del registro
     */
    public void unregister(Observer o);
    
    /**
     * Notifica al observador de los cambios
     */
    public void notifyObserver();
}