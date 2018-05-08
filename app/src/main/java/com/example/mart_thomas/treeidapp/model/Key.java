package com.example.mart_thomas.treeidapp.model;

import com.example.mart_thomas.treeidapp.R;

public class Key {

    private Page[] pages;

    public Key(){
        pages = new Page[47];

        pages[0] = new Page(R.drawable.pg1,R.string.pg1, new NextPage(2), new NextPage(14));
        pages[1] = new Page(R.drawable.pg2,R.string.pg2, new NextPage(3), new NextPage(4));
        pages[2] = new Page(R.drawable.pg3,R.string.pg3, new NextPage(24), new NextPage(25));
        pages[3] = new Page(R.drawable.pg4,R.string.pg4, new NextPage(5), new NextPage(6));
        pages[4] = new Page(R.drawable.pg5,R.string.pg5, new NextPage(26), new NextPage(27));
        pages[5] = new Page(R.drawable.pg6,R.string.pg6, new NextPage(7), new NextPage(10));
        pages[6] = new Page(R.drawable.pg7,R.string.pg7, new NextPage(8), new NextPage(9));
        pages[7] = new Page(R.drawable.pg8,R.string.pg8, new NextPage(28), new NextPage(29));
        pages[8] = new Page(R.drawable.pg9,R.string.pg9, new NextPage(30), new NextPage(31));
        pages[9] = new Page(R.drawable.pg10,R.string.pg10, new NextPage(32), new NextPage(11));
        pages[10] = new Page(R.drawable.pg11,R.string.pg11, new NextPage(33), new NextPage(12));
        pages[11] = new Page(R.drawable.pg12,R.string.pg12, new NextPage(34), new NextPage(13));
        pages[12] = new Page(R.drawable.pg13,R.string.pg13, new NextPage(35), new NextPage(36));
        pages[13] = new Page(R.drawable.pg14,R.string.pg14, new NextPage(15), new NextPage(16));
        pages[14] = new Page(R.drawable.pg15,R.string.pg15, new NextPage(37), new NextPage(38));
        pages[15] = new Page(R.drawable.pg16,R.string.pg16, new NextPage(17), new NextPage(18));
        pages[16] = new Page(R.drawable.pg17,R.string.pg17, new NextPage(39), new NextPage(40));
        pages[17] = new Page(R.drawable.pg18,R.string.pg18, new NextPage(41), new NextPage(19));
        pages[18] = new Page(R.drawable.pg19,R.string.pg19, new NextPage(20), new NextPage(21));
        pages[19] = new Page(R.drawable.pg20,R.string.pg20, new NextPage(42), new NextPage(43));
        pages[20] = new Page(R.drawable.pg21,R.string.pg21, new NextPage(44), new NextPage(22));
        pages[21] = new Page(R.drawable.pg22,R.string.pg22, new NextPage(45), new NextPage(23));
        pages[22] = new Page(R.drawable.pg23,R.string.pg23, new NextPage(46), new NextPage(47));

        pages[23] = new Page(R.drawable.pg24,R.string.pg24, R.string.pg24D);
        pages[24] = new Page(R.drawable.pg25,R.string.pg25, R.string.pg25D);
        pages[25] = new Page(R.drawable.pg26,R.string.pg26, R.string.pg26D);
        pages[26] = new Page(R.drawable.pg27,R.string.pg27, R.string.pg27D);
        pages[27] = new Page(R.drawable.pg28,R.string.pg28, R.string.pg28D);
        pages[28] = new Page(R.drawable.pg29,R.string.pg29, R.string.pg29D);
        pages[29] = new Page(R.drawable.pg30,R.string.pg30, R.string.pg30D);
        pages[30] = new Page(R.drawable.pg31,R.string.pg31, R.string.pg31D);
        pages[31] = new Page(R.drawable.pg32,R.string.pg32, R.string.pg32D);
        pages[32] = new Page(R.drawable.pg33,R.string.pg33, R.string.pg33D);
        pages[33] = new Page(R.drawable.pg34,R.string.pg34, R.string.pg34D);
        pages[34] = new Page(R.drawable.pg35,R.string.pg35, R.string.pg35D);
        pages[35] = new Page(R.drawable.pg36,R.string.pg36, R.string.pg36D);
        pages[36] = new Page(R.drawable.pg37,R.string.pg37, R.string.pg37D);
        pages[37] = new Page(R.drawable.pg38,R.string.pg38, R.string.pg38D);
        pages[38] = new Page(R.drawable.pg39,R.string.pg39, R.string.pg39D);
        pages[39] = new Page(R.drawable.pg40,R.string.pg40, R.string.pg40D);
        pages[40] = new Page(R.drawable.pg41,R.string.pg41, R.string.pg41D);
        pages[41] = new Page(R.drawable.pg42,R.string.pg42, R.string.pg42D);
        pages[42] = new Page(R.drawable.pg43,R.string.pg43, R.string.pg43D);
        pages[43] = new Page(R.drawable.pg44,R.string.pg44, R.string.pg44D);
        pages[44] = new Page(R.drawable.pg45,R.string.pg45, R.string.pg45D);
        pages[45] = new Page(R.drawable.pg46,R.string.pg46, R.string.pg46D);
        pages[46] = new Page(R.drawable.pg47,R.string.pg47, R.string.pg47D);

    }

    public Page getPage(int pageNumber) {
        if (pageNumber >= pages.length) {
            pageNumber = 0;
        }
        return pages[pageNumber];
    }
}
