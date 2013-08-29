/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kopnustestisochannel;

import org.jpos.iso.*;

/**
 *
 * @author mohamad
 */
public class KopnusPackager extends ISOBasePackager {
    public KopnusPackager() {
		setFieldPackager(new ISOFieldPackager[] {
				/* 000 */new IFA_NUMERIC(4, "Message Type Indicator"),
				/* 001 */new IFA_BITMAP(64, "Bitmap"),
				/* 002 */new IFA_LLCHAR(19, "Primary Account Number"),
				/* 003 */new IFA_NUMERIC(6, "Processing Code"),
				/* 004 */new IFA_NUMERIC(12, "Transaction amount"),
				/* 007 */new IFA_NUMERIC(10, "Transaction date and time"),
				/* 011 */new IFA_NUMERIC(6, "Sytem Trace Audit Number"),
                                /* 012 */new IFA_NUMERIC(6 , "Transaction time"),
                                /* 013 */new IFA_NUMERIC(4 , "Transaction date"),
                                /* 015 */new IFA_NUMERIC(4 , "Settlement date"),
                                /* 018 */new IFA_NUMERIC(4 , "Merchant type / Jenis Kanal Distribusi"),
                                /* 032 */new IFA_LLCHAR(11 , "Collecting agent/Acquirer code"),
                                /* 037 */new IFA_NUMERIC(12 , "Retrieval Reference Number"),
                                /* 039 */new IF_CHAR(2 , "Response Code"),
                                /* 041 */new IFA_NUMERIC(8 , "Terminal Id"),
                                /* 042 */new IFA_NUMERIC(15 , "Card acceptor identification code"),
                                /* 048 */new IFA_LLLCHAR(999 , "Additonal data"),
                                /* 049 */new IFA_NUMERIC(3 , "Currency code"),
                                /* 052 */new IF_CHAR(16 , "PIN"),
                                /* 061 */new IFA_LLLCHAR(999 , "Private data 1"),
                                /* 062 */new IFA_LLLCHAR(999 , "Private data 2"),
                                /* 063 */new IFA_LLLNUM(3 , "Institution code"),
                                /* 070 */new IFA_NUMERIC(3 , "Kode informasi untuk network management"),
                                /* 090 */new IFA_NUMERIC(42 , "Original Transaction Data"),
		});
	}

}
