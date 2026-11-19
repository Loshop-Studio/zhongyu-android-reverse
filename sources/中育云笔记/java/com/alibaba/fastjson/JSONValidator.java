package com.alibaba.fastjson;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* loaded from: classes3.dex */
public abstract class JSONValidator implements Cloneable, Closeable {

    /* renamed from: ch */
    protected char f3978ch;
    protected boolean eof;
    protected Type type;
    private Boolean valiateResult;
    protected int pos = -1;
    protected int count = 0;
    protected boolean supportMultiValue = false;

    public static class ReaderValidator extends JSONValidator {
        private static final ThreadLocal<char[]> bufLocal = new ThreadLocal<>();
        private char[] buf;

        /* renamed from: r */
        final Reader f3979r;
        private int end = -1;
        private int readCount = 0;

        public ReaderValidator(Reader reader) throws IOException {
            this.f3979r = reader;
            ThreadLocal<char[]> threadLocal = bufLocal;
            char[] cArr = threadLocal.get();
            this.buf = cArr;
            if (cArr != null) {
                threadLocal.set(null);
            } else {
                this.buf = new char[8192];
            }
            next();
            skipWhiteSpace();
        }

        @Override // com.alibaba.fastjson.JSONValidator, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            bufLocal.set(this.buf);
            this.f3979r.close();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void next() throws IOException {
            int i10 = this.pos;
            if (i10 < this.end) {
                char[] cArr = this.buf;
                int i11 = i10 + 1;
                this.pos = i11;
                this.f3978ch = cArr[i11];
                return;
            }
            if (this.eof) {
                return;
            }
            try {
                Reader reader = this.f3979r;
                char[] cArr2 = this.buf;
                int i12 = reader.read(cArr2, 0, cArr2.length);
                this.readCount++;
                if (i12 > 0) {
                    this.f3978ch = this.buf[0];
                    this.pos = 0;
                    this.end = i12 - 1;
                } else {
                    if (i12 == -1) {
                        this.pos = 0;
                        this.end = 0;
                        this.buf = null;
                        this.f3978ch = (char) 0;
                        this.eof = true;
                        return;
                    }
                    this.pos = 0;
                    this.end = 0;
                    this.buf = null;
                    this.f3978ch = (char) 0;
                    this.eof = true;
                    throw new JSONException("read error");
                }
            } catch (IOException unused) {
                throw new JSONException("read error");
            }
        }
    }

    public enum Type {
        Object,
        Array,
        Value
    }

    public static class UTF16Validator extends JSONValidator {
        private final String str;

        public UTF16Validator(String str) {
            this.str = str;
            next();
            skipWhiteSpace();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public final void fieldName() {
            char cCharAt;
            int i10 = this.pos;
            do {
                i10++;
                if (i10 >= this.str.length() || (cCharAt = this.str.charAt(i10)) == '\\') {
                    next();
                    while (true) {
                        char c10 = this.f3978ch;
                        if (c10 == '\\') {
                            next();
                            if (this.f3978ch == 'u') {
                                next();
                                next();
                                next();
                                next();
                                next();
                            } else {
                                next();
                            }
                        } else {
                            if (c10 == '\"') {
                                next();
                                return;
                            }
                            next();
                        }
                    }
                }
            } while (cCharAt != '\"');
            int i11 = i10 + 1;
            this.f3978ch = this.str.charAt(i11);
            this.pos = i11;
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void next() {
            int i10 = this.pos + 1;
            this.pos = i10;
            if (i10 < this.str.length()) {
                this.f3978ch = this.str.charAt(this.pos);
            } else {
                this.f3978ch = (char) 0;
                this.eof = true;
            }
        }
    }

    public static class UTF8InputStreamValidator extends JSONValidator {
        private static final ThreadLocal<byte[]> bufLocal = new ThreadLocal<>();
        private byte[] buf;

        /* renamed from: is */
        private final InputStream f3980is;
        private int end = -1;
        private int readCount = 0;

        public UTF8InputStreamValidator(InputStream inputStream) throws IOException {
            this.f3980is = inputStream;
            ThreadLocal<byte[]> threadLocal = bufLocal;
            byte[] bArr = threadLocal.get();
            this.buf = bArr;
            if (bArr != null) {
                threadLocal.set(null);
            } else {
                this.buf = new byte[8192];
            }
            next();
            skipWhiteSpace();
        }

        @Override // com.alibaba.fastjson.JSONValidator, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            bufLocal.set(this.buf);
            this.f3980is.close();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void next() throws IOException {
            int i10 = this.pos;
            if (i10 < this.end) {
                byte[] bArr = this.buf;
                int i11 = i10 + 1;
                this.pos = i11;
                this.f3978ch = (char) bArr[i11];
                return;
            }
            if (this.eof) {
                return;
            }
            try {
                InputStream inputStream = this.f3980is;
                byte[] bArr2 = this.buf;
                int i12 = inputStream.read(bArr2, 0, bArr2.length);
                this.readCount++;
                if (i12 > 0) {
                    this.f3978ch = (char) this.buf[0];
                    this.pos = 0;
                    this.end = i12 - 1;
                } else {
                    if (i12 == -1) {
                        this.pos = 0;
                        this.end = 0;
                        this.buf = null;
                        this.f3978ch = (char) 0;
                        this.eof = true;
                        return;
                    }
                    this.pos = 0;
                    this.end = 0;
                    this.buf = null;
                    this.f3978ch = (char) 0;
                    this.eof = true;
                    throw new JSONException("read error");
                }
            } catch (IOException unused) {
                throw new JSONException("read error");
            }
        }
    }

    public static class UTF8Validator extends JSONValidator {
        private final byte[] bytes;

        public UTF8Validator(byte[] bArr) {
            this.bytes = bArr;
            next();
            skipWhiteSpace();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void next() {
            int i10 = this.pos + 1;
            this.pos = i10;
            byte[] bArr = this.bytes;
            if (i10 < bArr.length) {
                this.f3978ch = (char) bArr[i10];
            } else {
                this.f3978ch = (char) 0;
                this.eof = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean any() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSONValidator.any():boolean");
    }

    public static JSONValidator from(String str) {
        return new UTF16Validator(str);
    }

    public static JSONValidator fromUtf8(byte[] bArr) {
        return new UTF8Validator(bArr);
    }

    public static final boolean isWhiteSpace(char c10) {
        return c10 == ' ' || c10 == '\t' || c10 == '\r' || c10 == '\n' || c10 == '\f' || c10 == '\b';
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void fieldName() {
        next();
        while (true) {
            char c10 = this.f3978ch;
            if (c10 == '\\') {
                next();
                if (this.f3978ch == 'u') {
                    next();
                    next();
                    next();
                    next();
                    next();
                } else {
                    next();
                }
            } else {
                if (c10 == '\"') {
                    next();
                    return;
                }
                next();
            }
        }
    }

    public Type getType() {
        if (this.type == null) {
            validate();
        }
        return this.type;
    }

    public boolean isSupportMultiValue() {
        return this.supportMultiValue;
    }

    public abstract void next();

    public JSONValidator setSupportMultiValue(boolean z10) {
        this.supportMultiValue = z10;
        return this;
    }

    public void skipWhiteSpace() {
        while (isWhiteSpace(this.f3978ch)) {
            next();
        }
    }

    public boolean string() {
        next();
        while (!this.eof) {
            char c10 = this.f3978ch;
            if (c10 == '\\') {
                next();
                if (this.f3978ch == 'u') {
                    next();
                    next();
                    next();
                    next();
                    next();
                } else {
                    next();
                }
            } else {
                if (c10 == '\"') {
                    next();
                    return true;
                }
                next();
            }
        }
        return false;
    }

    public boolean validate() {
        Boolean bool = this.valiateResult;
        if (bool != null) {
            return bool.booleanValue();
        }
        while (any()) {
            this.count++;
            if (this.eof) {
                this.valiateResult = Boolean.TRUE;
                return true;
            }
            if (!this.supportMultiValue) {
                this.valiateResult = Boolean.FALSE;
                return false;
            }
            skipWhiteSpace();
            if (this.eof) {
                this.valiateResult = Boolean.TRUE;
                return true;
            }
        }
        this.valiateResult = Boolean.FALSE;
        return false;
    }

    public static JSONValidator from(Reader reader) {
        return new ReaderValidator(reader);
    }

    public static JSONValidator fromUtf8(InputStream inputStream) {
        return new UTF8InputStreamValidator(inputStream);
    }
}
