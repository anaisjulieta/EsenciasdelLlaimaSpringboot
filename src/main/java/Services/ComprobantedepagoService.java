package Services;

import Entities.ComprobantedepagoEntity;

import java.util.List;
import java.util.Optional;

public interface ComprobantedepagoService {

    List<ComprobantedepagoEntity> obtenerComprobantedepago();

    Optional<ComprobantedepagoEntity> obtenerComprobantedepagoPorId(Integer id);

    ComprobantedepagoEntity guardarComprobantedepago(ComprobantedepagoEntity comprobantedepagoEntity);

    void borrarComprobantedepagoPorId(Integer id);

    ComprobantedepagoEntity editarComprobantedepagoPorId(Integer id, ComprobantedepagoEntity comprobantedepagoEntity);
}
