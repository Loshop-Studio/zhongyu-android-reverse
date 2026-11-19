package com.tendcloud.tenddata;

import android.os.Parcel;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/* renamed from: com.tendcloud.tenddata.cf */
/* loaded from: classes5.dex */
public class C7901cf extends File {
    public final String content;

    /* renamed from: com.tendcloud.tenddata.cf$a */
    public static class a extends C7901cf {
        public ArrayList<b> groups;

        private a(String str) {
            super(str);
            try {
                this.groups = new ArrayList<>();
                for (String str2 : this.content.split(SignParameters.NEW_LINE)) {
                    try {
                        this.groups.add(new b(str2));
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }

        public static a get(int i10) {
            try {
                return new a(String.format("/proc/%d/cgroup", Integer.valueOf(i10)));
            } catch (Throwable unused) {
                return null;
            }
        }

        public b getGroup(String str) {
            try {
                ArrayList<b> arrayList = this.groups;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    b bVar = arrayList.get(i10);
                    i10++;
                    b bVar2 = bVar;
                    for (String str2 : bVar2.subsystems.split(",")) {
                        if (str2.equals(str)) {
                            return bVar2;
                        }
                    }
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.tendcloud.tenddata.cf$d */
    public static class d extends C7901cf {
        private d(String str) {
            super(str);
        }

        public static d get(int i10) {
            try {
                return new d(String.format("/proc/%d/status", Integer.valueOf(i10)));
            } catch (Throwable unused) {
                return null;
            }
        }

        public int getGid() {
            try {
                return Integer.parseInt(getValue("Gid").split("\\s+")[0]);
            } catch (Throwable unused) {
                return -1;
            }
        }

        public int getUid() {
            try {
                return Integer.parseInt(getValue("Uid").split("\\s+")[0]);
            } catch (Throwable unused) {
                return -1;
            }
        }

        public String getValue(String str) {
            try {
                for (String str2 : this.content.split(SignParameters.NEW_LINE)) {
                    if (str2.startsWith(str + ":")) {
                        return str2.split(str + ":")[1].trim();
                    }
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        private d(Parcel parcel) {
            super(parcel);
        }
    }

    public C7901cf(String str) {
        super(str);
        this.content = readFile(str);
    }

    public static String readFile(String str) {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
            try {
                String str2 = "";
                for (String line = bufferedReader2.readLine(); line != null; line = bufferedReader2.readLine()) {
                    sb2.append(str2);
                    sb2.append(line);
                    str2 = SignParameters.NEW_LINE;
                    if (sb2.length() > 104857600) {
                        throw new RuntimeException("Input stream more than 100 MB size limit");
                    }
                }
                String string = sb2.toString();
                try {
                    bufferedReader2.close();
                } catch (Throwable unused) {
                }
                return string;
            } catch (Throwable unused2) {
                bufferedReader = bufferedReader2;
                try {
                    String string2 = sb2.toString();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    return string2;
                } catch (Throwable th) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable unused5) {
        }
    }

    @Override // java.io.File
    public long length() {
        return this.content.length();
    }

    /* renamed from: com.tendcloud.tenddata.cf$c */
    public static class c extends C7901cf {
        private String[] fields;

        private c(String str) {
            super(str);
            this.fields = new String[0];
            try {
                this.fields = this.content.split("\\s+");
            } catch (Throwable unused) {
            }
        }

        public static c get(int i10) {
            try {
                return new c(String.format("/proc/%d/stat", Integer.valueOf(i10)));
            } catch (Throwable unused) {
                return null;
            }
        }

        public String getComm() {
            try {
                return this.fields[1].replace("(", "").replace(")", "");
            } catch (Throwable unused) {
                return "";
            }
        }

        public long startTime() {
            try {
                return Long.parseLong(this.fields[21]);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public char state() {
            try {
                return this.fields[2].charAt(0);
            } catch (Throwable unused) {
                return (char) 0;
            }
        }

        private c(Parcel parcel) {
            super(parcel);
            this.fields = new String[0];
            try {
                this.fields = parcel.createStringArray();
            } catch (Throwable unused) {
            }
        }
    }

    public C7901cf(Parcel parcel) {
        super(parcel.readString());
        this.content = parcel.readString();
    }

    /* renamed from: com.tendcloud.tenddata.cf$b */
    public static class b {
        protected String group;

        /* renamed from: id */
        protected int f14534id;
        protected String subsystems;

        public b(String str) {
            try {
                String[] strArrSplit = str.split(":");
                this.f14534id = Integer.parseInt(strArrSplit[0]);
                this.subsystems = strArrSplit[1];
                this.group = strArrSplit[2];
            } catch (Throwable unused) {
            }
        }

        public b(Parcel parcel) {
            try {
                this.f14534id = parcel.readInt();
                this.subsystems = parcel.readString();
                this.group = parcel.readString();
            } catch (Throwable unused) {
            }
        }
    }
}
