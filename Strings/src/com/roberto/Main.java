package com.roberto;

public class Main
{

    public static void main(String[] args)
    {
        String TABLE_NOTICIA = "PLT_NOTICIA";

        String ALIAS = "TrueNoticias";

        String COL_IDT_NOTICIA = "IDT_NOTICIA";

        String COL_DSC_NOTICIA = "DSC_NOTICIA";

        String COL_FLG_ACTIVE = "FLG_ACTIVE";

        String sql = "UPDATE " + TABLE_NOTICIA + " " + ALIAS;
        sql += " SET " + ALIAS + "." + COL_FLG_ACTIVE + " = '1'";
        sql += " WHERE " + ALIAS + "." + COL_IDT_NOTICIA + " = '" + 1 + "'";
        //sql = appendContextFilter(sql, ALIAS);
        System.out.println(sql);
    }
}

    UPDATE LOGUS_PORTAL_ESTAG.PLT_NOTICIA TrueNoticias SET TrueNoticias.FLG_ACTIVE = '1' WHERE TrueNoticias.IDT_NOTICIA = '2' AND  (TrueNoticias.COD_CLIENTE_CTX = '00001' and TrueNoticias.ANO_EXERCICIO_CTX = 2017)