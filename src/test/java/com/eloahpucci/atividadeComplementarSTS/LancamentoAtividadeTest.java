package com.eloahpucci.atividadeComplementarSTS;

import java.time.LocalDate;
import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.eloahpucci.atividadeComplementarSTS.domain.LancamentoAtividade;

public class LancamentoAtividadeTest {
	
	private LancamentoAtividade lancamentoAtividade;
	
	@Before
	public void init() {
		lancamentoAtividade = new LancamentoAtividade();
	}
	
	@Test
	public void testePrimeiroSemestre() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.MONTH, 6);
		c.set(Calendar.YEAR, 2018);
		lancamentoAtividade.setDataFim(c.getTime());
		String semestre = lancamentoAtividade.getSemestreAtividade();
		Assert.assertEquals(semestre, "2018-1");
	}

}
