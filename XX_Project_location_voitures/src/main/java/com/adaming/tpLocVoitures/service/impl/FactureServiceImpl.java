package com.adaming.tpLocVoitures.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.tpLocVoitures.entities.Facture;
import com.adaming.tpLocVoitures.service.IFactureService;

/**
 * @author inti0314
 *
 */
@Service
@Transactional
public class FactureServiceImpl extends GenericServiceImpl<Facture> implements
		IFactureService {
	
}
