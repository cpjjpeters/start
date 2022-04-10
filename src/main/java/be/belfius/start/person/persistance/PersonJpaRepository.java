package be.belfius.start.person.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;
import be.belfius.start.person.persistance.entity.PersonJpaEntity;

/**
 * @author tersc
 * first appearance on 10/04/2022
 */

public interface PersonJpaRepository extends JpaRepository<PersonJpaEntity, Long>, JpaSpecificationExecutor<PersonJpaEntity> {

    Optional<PersonJpaEntity> findById(Long id);

    List<PersonJpaEntity> findAll();


//    List<PersonJpaEntity> findDocumentByProductAndBoDealNumberAndDocumentType(String product, String boDealNumber,
//                                                                                DocumentType documentType);
//
//    List<PersonJpaEntity> findDocumentByProductAndBoDealNumberAndDocumentTypeAndDealEventNotIn(String product, String boDealNumber,
//                                                                                                 DocumentType documentType, Collection<String> dealEvents);
//
//    List<PersonJpaEntity> findByBoDealNumberAndSrcAppCodeAndDocumentTypeAndDocumentStatusAndDocumentFlowStatusNotAndDealEventNotIn(
//            String boDealNumber, String srcAppCode, DocumentType documentType, DocumentStatus documentStatus,
//            DocumentFlowStatus documentFlowStatus, Collection<String> dealEvents);
//
//    //	@Query("select dateadd(second,-6,TIMESTAMP_SENT)")
////	PersonJpaEntity findViaDateAdd();
//    Optional<PersonJpaEntity> findByDocumentIdAndDocumentStatus(String documentId, DocumentStatus documentStatus);
//
//    Optional<PersonJpaEntity> findByQmId(long qmId);
}
