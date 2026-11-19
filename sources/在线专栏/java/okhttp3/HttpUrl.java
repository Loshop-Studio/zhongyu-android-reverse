package okhttp3;

import anet.channel.util.HttpConstant;
import com.taobao.accs.common.Constants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.C2724g0;
import kotlin.collections.C2730l;
import kotlin.collections.C2731m;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1032a;
import p014b3.C1037f;
import p082e3.C2484j;
import p082e3.C2495u;
import p082e3.C2496v;

/* loaded from: classes.dex */
public final class HttpUrl {

    @NotNull
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET = "";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";

    @NotNull
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";

    @NotNull
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";

    @NotNull
    public static final String QUERY_ENCODE_SET = " \"'<>#";

    @NotNull
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @Nullable
    private final String fragment;

    @NotNull
    private final String host;
    private final boolean isHttps;

    @NotNull
    private final String password;

    @NotNull
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;

    @NotNull
    private final String scheme;
    private final String url;

    @NotNull
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class Builder {
        public static final Companion Companion = new Companion(null);

        @NotNull
        public static final String INVALID_HOST = "Invalid URL host";

        @Nullable
        private String encodedFragment;

        @NotNull
        private final List<String> encodedPathSegments;

        @Nullable
        private List<String> encodedQueryNamesAndValues;

        @Nullable
        private String host;

        @Nullable
        private String scheme;

        @NotNull
        private String encodedUsername = "";

        @NotNull
        private String encodedPassword = "";
        private int port = -1;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C2764g c2764g) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i4, int i5) throws NumberFormatException {
                try {
                    int i6 = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i4, i5, "", false, false, false, false, null, 248, null));
                    if (1 <= i6 && 65535 >= i6) {
                        return i6;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i4, int i5) {
                while (i4 < i5) {
                    char cCharAt = str.charAt(i4);
                    if (cCharAt == ':') {
                        return i4;
                    }
                    if (cCharAt == '[') {
                        do {
                            i4++;
                            if (i4 < i5) {
                            }
                        } while (str.charAt(i4) != ']');
                    }
                    i4++;
                }
                return i5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i4, int i5) {
                if (i5 - i4 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i4);
                if ((C2769l.m9243g(cCharAt, 97) < 0 || C2769l.m9243g(cCharAt, 122) > 0) && (C2769l.m9243g(cCharAt, 65) < 0 || C2769l.m9243g(cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i4++;
                    if (i4 >= i5) {
                        return -1;
                    }
                    char cCharAt2 = str.charAt(i4);
                    if ('a' > cCharAt2 || 'z' < cCharAt2) {
                        if ('A' > cCharAt2 || 'Z' < cCharAt2) {
                            if ('0' > cCharAt2 || '9' < cCharAt2) {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i4;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i4, int i5) {
                int i6 = 0;
                while (i4 < i5) {
                    char cCharAt = str.charAt(i4);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i6++;
                    i4++;
                }
                return i6;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i4 = this.port;
            if (i4 != -1) {
                return i4;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            C2769l.m9239c(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return C2769l.m9237a(str, ".") || C2495u.m8343o(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return C2769l.m9237a(str, "..") || C2495u.m8343o(str, "%2e.", true) || C2495u.m8343o(str, ".%2e", true) || C2495u.m8343o(str, "%2e%2e", true);
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
            } else {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void push(String str, int i4, int i5, boolean z3, boolean z4) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i4, i5, HttpUrl.PATH_SEGMENT_ENCODE_SET, z4, false, false, false, null, 240, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (z3) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            C2769l.m9239c(list);
            C1032a c1032aM4827h = C1037f.m4827h(C1037f.m4826g(list.size() - 2, 0), 2);
            int iM4802a = c1032aM4827h.m4802a();
            int iM4803b = c1032aM4827h.m4803b();
            int iM4804c = c1032aM4827h.m4804c();
            if (iM4804c >= 0) {
                if (iM4802a > iM4803b) {
                    return;
                }
            } else if (iM4802a < iM4803b) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                C2769l.m9239c(list2);
                if (C2769l.m9237a(str, list2.get(iM4802a))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    C2769l.m9239c(list3);
                    list3.remove(iM4802a + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    C2769l.m9239c(list4);
                    list4.remove(iM4802a);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    C2769l.m9239c(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (iM4802a == iM4803b) {
                    return;
                } else {
                    iM4802a += iM4804c;
                }
            }
        }

        private final void resolvePath(String str, int i4, int i5) {
            if (i4 == i5) {
                return;
            }
            char cCharAt = str.charAt(i4);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i4++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i6 = i4;
                if (i6 >= i5) {
                    return;
                }
                i4 = Util.delimiterOffset(str, "/\\", i6, i5);
                boolean z3 = i4 < i5;
                push(str, i6, i4, z3, true);
                if (z3) {
                    i4++;
                }
            }
        }

        @NotNull
        public final Builder addEncodedPathSegment(@NotNull String encodedPathSegment) {
            C2769l.m9241e(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedPathSegments(@NotNull String encodedPathSegments) {
            C2769l.m9241e(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        @NotNull
        public final Builder addEncodedQueryParameter(@NotNull String encodedName, @Nullable String str) {
            C2769l.m9241e(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            C2769l.m9239c(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            C2769l.m9239c(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        @NotNull
        public final Builder addPathSegment(@NotNull String pathSegment) {
            C2769l.m9241e(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @NotNull
        public final Builder addPathSegments(@NotNull String pathSegments) {
            C2769l.m9241e(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        @NotNull
        public final Builder addQueryParameter(@NotNull String name, @Nullable String str) {
            C2769l.m9241e(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            C2769l.m9239c(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            C2769l.m9239c(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        @NotNull
        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.Companion;
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(C2731m.m9149p(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                arrayList = new ArrayList(C2731m.m9149p(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null) : null, toString());
        }

        @NotNull
        public final Builder encodedFragment(@Nullable String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @NotNull
        public final Builder encodedPassword(@NotNull String encodedPassword) {
            C2769l.m9241e(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @NotNull
        public final Builder encodedPath(@NotNull String encodedPath) {
            C2769l.m9241e(encodedPath, "encodedPath");
            if (C2495u.m8340C(encodedPath, "/", false, 2, null)) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.HttpUrl.Builder encodedQuery(@org.jetbrains.annotations.Nullable java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.Companion
                r2 = 0
                r3 = 0
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                java.lang.String r4 = " \"'<>#"
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.encodedQuery(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        @NotNull
        public final Builder encodedUsername(@NotNull String encodedUsername) {
            C2769l.m9241e(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @NotNull
        public final Builder fragment(@Nullable String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @Nullable
        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        @NotNull
        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        @NotNull
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @Nullable
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @NotNull
        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        @Nullable
        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        @Nullable
        public final String getScheme$okhttp() {
            return this.scheme;
        }

        @NotNull
        public final Builder host(@NotNull String host) {
            C2769l.m9241e(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        @NotNull
        public final Builder parse$okhttp(@Nullable HttpUrl httpUrl, @NotNull String input) throws NumberFormatException {
            int iDelimiterOffset;
            int i4;
            int i5;
            String str;
            int i6;
            String str2;
            int i7;
            boolean z3;
            boolean z4;
            C2769l.m9241e(input, "input");
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c4 = 65535;
            if (iSchemeDelimiterOffset != -1) {
                if (C2495u.m8354z(input, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = HttpConstant.HTTPS;
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!C2495u.m8354z(input, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iSchemeDelimiterOffset);
                        C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.scheme = HttpConstant.HTTP;
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.scheme = httpUrl.scheme();
            }
            int iSlashCount = companion.slashCount(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            char c5 = '?';
            char c6 = '#';
            if (iSlashCount >= 2 || httpUrl == null || (!C2769l.m9237a(httpUrl.scheme(), this.scheme))) {
                int i8 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(input, "@/\\?#", i8, iIndexOfLastNonAsciiWhitespace$default);
                    char cCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? input.charAt(iDelimiterOffset) : (char) 65535;
                    if (cCharAt == c4 || cCharAt == c6 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c5) {
                        break;
                    }
                    if (cCharAt != '@') {
                        str2 = str3;
                        i6 = iIndexOfLastNonAsciiWhitespace$default;
                    } else {
                        if (z5) {
                            i6 = iIndexOfLastNonAsciiWhitespace$default;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            str2 = str3;
                            i7 = iDelimiterOffset;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i8, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                            z3 = z6;
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(input, ':', i8, iDelimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            i6 = iIndexOfLastNonAsciiWhitespace$default;
                            String str4 = str3;
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, input, i8, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z6) {
                                strCanonicalize$okhttp$default = this.encodedUsername + "%40" + strCanonicalize$okhttp$default;
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, input, iDelimiterOffset2 + 1, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z4 = true;
                            } else {
                                z4 = z5;
                            }
                            z5 = z4;
                            str2 = str4;
                            z3 = true;
                            i7 = iDelimiterOffset;
                        }
                        i8 = i7 + 1;
                        z6 = z3;
                    }
                    str3 = str2;
                    iIndexOfLastNonAsciiWhitespace$default = i6;
                    c6 = '#';
                    c5 = '?';
                    c4 = 65535;
                }
                String str5 = str3;
                i4 = iIndexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int iPortColonOffset = companion3.portColonOffset(input, i8, iDelimiterOffset);
                int i9 = iPortColonOffset + 1;
                if (i9 < iDelimiterOffset) {
                    i5 = i8;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, input, i8, iPortColonOffset, false, 4, null));
                    int port = companion3.parsePort(input, i9, iDelimiterOffset);
                    this.port = port;
                    if (!(port != -1)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i9, iDelimiterOffset);
                        C2769l.m9240d(strSubstring2, str5);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    str = str5;
                } else {
                    i5 = i8;
                    str = str5;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, input, i5, iPortColonOffset, false, 4, null));
                    String str6 = this.scheme;
                    C2769l.m9239c(str6);
                    this.port = companion4.defaultPort(str6);
                }
                if (!(this.host != null)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i5, iPortColonOffset);
                    C2769l.m9240d(strSubstring3, str);
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || input.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i4 = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i10 = i4;
            int iDelimiterOffset3 = Util.delimiterOffset(input, "?#", iIndexOfFirstNonAsciiWhitespace$default, i10);
            resolvePath(input, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 < i10 && input.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = Util.delimiterOffset(input, '#', iDelimiterOffset3, i10);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, input, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < i10 && input.charAt(iDelimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, iDelimiterOffset3 + 1, i10, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @NotNull
        public final Builder password(@NotNull String password) {
            C2769l.m9241e(password, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        @NotNull
        public final Builder port(int i4) {
            if (1 <= i4 && 65535 >= i4) {
                this.port = i4;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i4).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.HttpUrl.Builder query(@org.jetbrains.annotations.Nullable java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.Companion
                r2 = 0
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 219(0xdb, float:3.07E-43)
                r11 = 0
                java.lang.String r4 = " \"'<>#"
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.query(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        @NotNull
        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new C2484j("[\"<>^`{|}]").m8280d(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i4 = 0; i4 < size; i4++) {
                List<String> list = this.encodedPathSegments;
                list.set(i4, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i4), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    String str2 = list2.get(i5);
                    list2.set(i5, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        @NotNull
        public final Builder removeAllEncodedQueryParameters(@NotNull String encodedName) {
            C2769l.m9241e(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        @NotNull
        public final Builder removeAllQueryParameters(@NotNull String name) {
            C2769l.m9241e(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        @NotNull
        public final Builder removePathSegment(int i4) {
            this.encodedPathSegments.remove(i4);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @NotNull
        public final Builder scheme(@NotNull String scheme) {
            C2769l.m9241e(scheme, "scheme");
            if (C2495u.m8343o(scheme, HttpConstant.HTTP, true)) {
                this.scheme = HttpConstant.HTTP;
            } else {
                if (!C2495u.m8343o(scheme, HttpConstant.HTTPS, true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.scheme = HttpConstant.HTTPS;
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(@Nullable String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(@NotNull String str) {
            C2769l.m9241e(str, "<set-?>");
            this.encodedPassword = str;
        }

        @NotNull
        public final Builder setEncodedPathSegment(int i4, @NotNull String encodedPathSegment) {
            C2769l.m9241e(encodedPathSegment, "encodedPathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i4, strCanonicalize$okhttp$default);
            if ((isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @NotNull
        public final Builder setEncodedQueryParameter(@NotNull String encodedName, @Nullable String str) {
            C2769l.m9241e(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, str);
            return this;
        }

        public final void setEncodedUsername$okhttp(@NotNull String str) {
            C2769l.m9241e(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(@Nullable String str) {
            this.host = str;
        }

        @NotNull
        public final Builder setPathSegment(int i4, @NotNull String pathSegment) {
            C2769l.m9241e(pathSegment, "pathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if ((isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) ? false : true) {
                this.encodedPathSegments.set(i4, strCanonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
        }

        public final void setPort$okhttp(int i4) {
            this.port = i4;
        }

        @NotNull
        public final Builder setQueryParameter(@NotNull String name, @Nullable String str) {
            C2769l.m9241e(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, str);
            return this;
        }

        public final void setScheme$okhttp(@Nullable String str) {
            this.scheme = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L23
                r1 = 1
                goto L24
            L23:
                r1 = 0
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = 1
                goto L33
            L32:
                r1 = 0
            L33:
                if (r1 == 0) goto L53
            L35:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                goto L44
            L43:
                r2 = 0
            L44:
                if (r2 == 0) goto L4e
                r0.append(r4)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L4e:
                r1 = 64
                r0.append(r1)
            L53:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L77
                kotlin.jvm.internal.C2769l.m9239c(r1)
                r2 = 2
                r5 = 0
                boolean r1 = p082e3.C2486l.m8291G(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L72
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L77
            L72:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L77:
                int r1 = r6.port
                r2 = -1
                if (r1 != r2) goto L80
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L99
            L80:
                int r1 = r6.effectivePort()
                java.lang.String r2 = r6.scheme
                if (r2 == 0) goto L93
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                kotlin.jvm.internal.C2769l.m9239c(r2)
                int r2 = r3.defaultPort(r2)
                if (r1 == r2) goto L99
            L93:
                r0.append(r4)
                r0.append(r1)
            L99:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto Lb1
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.C2769l.m9239c(r2)
                r1.toQueryString$okhttp(r2, r0)
            Lb1:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lbf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lbf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.C2769l.m9240d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        @NotNull
        public final Builder username(@NotNull String username) {
            C2769l.m9241e(username, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z3) {
            int i4 = 0;
            do {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i4, str.length());
                push(str, i4, iDelimiterOffset, iDelimiterOffset < str.length(), z3);
                i4 = iDelimiterOffset + 1;
            } while (i4 <= str.length());
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i4, int i5, String str2, boolean z3, boolean z4, boolean z5, boolean z6, Charset charset, int i6, Object obj) {
            return companion.canonicalize$okhttp(str, (i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? str.length() : i5, str2, (i6 & 8) != 0 ? false : z3, (i6 & 16) != 0 ? false : z4, (i6 & 32) != 0 ? false : z5, (i6 & 64) != 0 ? false : z6, (i6 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i4, int i5) {
            int i6 = i4 + 2;
            return i6 < i5 && str.charAt(i4) == '%' && Util.parseHexDigit(str.charAt(i4 + 1)) != -1 && Util.parseHexDigit(str.charAt(i6)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i4, int i5, boolean z3, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = str.length();
            }
            if ((i6 & 4) != 0) {
                z3 = false;
            }
            return companion.percentDecode$okhttp(str, i4, i5, z3);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0096 A[LOOP:1: B:50:0x0090->B:52:0x0096, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void writeCanonicalized(okio.Buffer r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lbf
                java.lang.String r7 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r1, r7)
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L2e
                r8 = 9
                if (r7 == r8) goto L29
                r8 = 10
                if (r7 == r8) goto L29
                r8 = 12
                if (r7 == r8) goto L29
                r8 = 13
                if (r7 == r8) goto L29
                goto L2e
            L29:
                r8 = r14
                r12 = r19
                goto Lb8
            L2e:
                r8 = 43
                if (r7 != r8) goto L3f
                if (r22 == 0) goto L3f
                if (r20 == 0) goto L39
                java.lang.String r8 = "+"
                goto L3b
            L39:
                java.lang.String r8 = "%2B"
            L3b:
                r15.writeUtf8(r8)
                goto L29
            L3f:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L6f
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L6f
                r8 = 128(0x80, float:1.8E-43)
                if (r7 < r8) goto L4f
                if (r23 == 0) goto L6f
            L4f:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = p082e3.C2486l.m8291G(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L6d
                if (r7 != r9) goto L68
                if (r20 == 0) goto L6d
                if (r21 == 0) goto L68
                r8 = r14
                boolean r10 = r14.isPercentEncoded(r1, r5, r2)
                if (r10 != 0) goto L69
                goto L72
            L68:
                r8 = r14
            L69:
                r15.writeUtf8CodePoint(r7)
                goto Lb8
            L6d:
                r8 = r14
                goto L72
            L6f:
                r8 = r14
                r12 = r19
            L72:
                if (r6 != 0) goto L79
                okio.Buffer r6 = new okio.Buffer
                r6.<init>()
            L79:
                if (r3 == 0) goto L8d
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.C2769l.m9237a(r3, r10)
                if (r10 == 0) goto L84
                goto L8d
            L84:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.writeString(r1, r5, r10, r3)
                goto L90
            L8d:
                r6.writeUtf8CodePoint(r7)
            L90:
                boolean r10 = r6.exhausted()
                if (r10 != 0) goto Lb8
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L90
            Lb8:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lbf:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(okio.Buffer, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(Buffer buffer, String str, int i4, int i5, boolean z3) {
            int i6;
            while (i4 < i5) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int iCodePointAt = str.codePointAt(i4);
                if (iCodePointAt == 37 && (i6 = i4 + 2) < i5) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i4 + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i6));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i4 += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((hexDigit << 4) + hexDigit2);
                        i4 = Character.charCount(iCodePointAt) + i6;
                    }
                } else if (iCodePointAt == 43 && z3) {
                    buffer.writeByte(32);
                    i4++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i4 += Character.charCount(iCodePointAt);
                }
            }
        }

        @NotNull
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m10809deprecated_get(@NotNull String url) {
            C2769l.m9241e(url, "url");
            return get(url);
        }

        @Nullable
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m10812deprecated_parse(@NotNull String url) {
            C2769l.m9241e(url, "url");
            return parse(url);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String canonicalize$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r14, int r15, int r16, @org.jetbrains.annotations.NotNull java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, @org.jetbrains.annotations.Nullable java.nio.charset.Charset r22) {
            /*
                r13 = this;
                r2 = r14
                r4 = r16
                r5 = r17
                java.lang.String r0 = "$this$canonicalize"
                kotlin.jvm.internal.C2769l.m9241e(r14, r0)
                java.lang.String r0 = "encodeSet"
                kotlin.jvm.internal.C2769l.m9241e(r5, r0)
                r3 = r15
            L10:
                if (r3 >= r4) goto L6f
                int r0 = r14.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L4c
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L4c
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < r1) goto L24
                if (r21 == 0) goto L4c
            L24:
                char r1 = (char) r0
                r6 = 0
                r7 = 2
                r8 = 0
                boolean r1 = p082e3.C2486l.m8291G(r5, r1, r6, r7, r8)
                if (r1 != 0) goto L4c
                r1 = 37
                if (r0 != r1) goto L3e
                if (r18 == 0) goto L4c
                if (r19 == 0) goto L3e
                r11 = r13
                boolean r1 = r13.isPercentEncoded(r14, r3, r4)
                if (r1 == 0) goto L4d
                goto L3f
            L3e:
                r11 = r13
            L3f:
                r1 = 43
                if (r0 != r1) goto L46
                if (r20 == 0) goto L46
                goto L4d
            L46:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L10
            L4c:
                r11 = r13
            L4d:
                okio.Buffer r12 = new okio.Buffer
                r12.<init>()
                r0 = r15
                r12.writeUtf8(r14, r15, r3)
                r0 = r13
                r1 = r12
                r2 = r14
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r0.writeCanonicalized(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r12.readUtf8()
                return r0
            L6f:
                r11 = r13
                r0 = r15
                java.lang.String r0 = r14.substring(r15, r16)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C2769l.m9240d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.canonicalize$okhttp(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        public final int defaultPort(@NotNull String scheme) {
            C2769l.m9241e(scheme, "scheme");
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && scheme.equals(HttpConstant.HTTPS)) {
                    return Constants.PORT;
                }
            } else if (scheme.equals(HttpConstant.HTTP)) {
                return 80;
            }
            return -1;
        }

        @NotNull
        public final HttpUrl get(@NotNull String toHttpUrl) {
            C2769l.m9241e(toHttpUrl, "$this$toHttpUrl");
            return new Builder().parse$okhttp(null, toHttpUrl).build();
        }

        @Nullable
        public final HttpUrl parse(@NotNull String toHttpUrlOrNull) {
            C2769l.m9241e(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            try {
                return get(toHttpUrlOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        public final String percentDecode$okhttp(@NotNull String percentDecode, int i4, int i5, boolean z3) {
            C2769l.m9241e(percentDecode, "$this$percentDecode");
            for (int i6 = i4; i6 < i5; i6++) {
                char cCharAt = percentDecode.charAt(i6);
                if (cCharAt == '%' || (cCharAt == '+' && z3)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(percentDecode, i4, i6);
                    writePercentDecoded(buffer, percentDecode, i6, i5, z3);
                    return buffer.readUtf8();
                }
            }
            String strSubstring = percentDecode.substring(i4, i5);
            C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void toPathString$okhttp(@NotNull List<String> toPathString, @NotNull StringBuilder out) {
            C2769l.m9241e(toPathString, "$this$toPathString");
            C2769l.m9241e(out, "out");
            int size = toPathString.size();
            for (int i4 = 0; i4 < size; i4++) {
                out.append('/');
                out.append(toPathString.get(i4));
            }
        }

        @NotNull
        public final List<String> toQueryNamesAndValues$okhttp(@NotNull String toQueryNamesAndValues) {
            C2769l.m9241e(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (i4 <= toQueryNamesAndValues.length()) {
                int iM8380T = C2496v.m8380T(toQueryNamesAndValues, '&', i4, false, 4, null);
                if (iM8380T == -1) {
                    iM8380T = toQueryNamesAndValues.length();
                }
                int i5 = iM8380T;
                int iM8380T2 = C2496v.m8380T(toQueryNamesAndValues, '=', i4, false, 4, null);
                if (iM8380T2 == -1 || iM8380T2 > i5) {
                    String strSubstring = toQueryNamesAndValues.substring(i4, i5);
                    C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = toQueryNamesAndValues.substring(i4, iM8380T2);
                    C2769l.m9240d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = toQueryNamesAndValues.substring(iM8380T2 + 1, i5);
                    C2769l.m9240d(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i4 = i5 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(@NotNull List<String> toQueryString, @NotNull StringBuilder out) {
            C2769l.m9241e(toQueryString, "$this$toQueryString");
            C2769l.m9241e(out, "out");
            C1032a c1032aM4827h = C1037f.m4827h(C1037f.m4828i(0, toQueryString.size()), 2);
            int iM4802a = c1032aM4827h.m4802a();
            int iM4803b = c1032aM4827h.m4803b();
            int iM4804c = c1032aM4827h.m4804c();
            if (iM4804c >= 0) {
                if (iM4802a > iM4803b) {
                    return;
                }
            } else if (iM4802a < iM4803b) {
                return;
            }
            while (true) {
                String str = toQueryString.get(iM4802a);
                String str2 = toQueryString.get(iM4802a + 1);
                if (iM4802a > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (iM4802a == iM4803b) {
                    return;
                } else {
                    iM4802a += iM4804c;
                }
            }
        }

        @Nullable
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m10811deprecated_get(@NotNull URL url) {
            C2769l.m9241e(url, "url");
            return get(url);
        }

        @Nullable
        public final HttpUrl get(@NotNull URL toHttpUrlOrNull) {
            C2769l.m9241e(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            String string = toHttpUrlOrNull.toString();
            C2769l.m9240d(string, "toString()");
            return parse(string);
        }

        @Nullable
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m10810deprecated_get(@NotNull URI uri) {
            C2769l.m9241e(uri, "uri");
            return get(uri);
        }

        @Nullable
        public final HttpUrl get(@NotNull URI toHttpUrlOrNull) {
            C2769l.m9241e(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            String string = toHttpUrlOrNull.toString();
            C2769l.m9240d(string, "toString()");
            return parse(string);
        }
    }

    public HttpUrl(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i4, @NotNull List<String> pathSegments, @Nullable List<String> list, @Nullable String str, @NotNull String url) {
        C2769l.m9241e(scheme, "scheme");
        C2769l.m9241e(username, "username");
        C2769l.m9241e(password, "password");
        C2769l.m9241e(host, "host");
        C2769l.m9241e(pathSegments, "pathSegments");
        C2769l.m9241e(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i4;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = C2769l.m9237a(scheme, HttpConstant.HTTPS);
    }

    public static final int defaultPort(@NotNull String str) {
        return Companion.defaultPort(str);
    }

    @NotNull
    public static final HttpUrl get(@NotNull String str) {
        return Companion.get(str);
    }

    @Nullable
    public static final HttpUrl get(@NotNull URI uri) {
        return Companion.get(uri);
    }

    @Nullable
    public static final HttpUrl get(@NotNull URL url) {
        return Companion.get(url);
    }

    @Nullable
    public static final HttpUrl parse(@NotNull String str) {
        return Companion.parse(str);
    }

    @Nullable
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m10790deprecated_encodedFragment() {
        return encodedFragment();
    }

    @NotNull
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m10791deprecated_encodedPassword() {
        return encodedPassword();
    }

    @NotNull
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m10792deprecated_encodedPath() {
        return encodedPath();
    }

    @NotNull
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m10793deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @Nullable
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m10794deprecated_encodedQuery() {
        return encodedQuery();
    }

    @NotNull
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m10795deprecated_encodedUsername() {
        return encodedUsername();
    }

    @Nullable
    /* renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m10796deprecated_fragment() {
        return this.fragment;
    }

    @NotNull
    /* renamed from: -deprecated_host, reason: not valid java name */
    public final String m10797deprecated_host() {
        return this.host;
    }

    @NotNull
    /* renamed from: -deprecated_password, reason: not valid java name */
    public final String m10798deprecated_password() {
        return this.password;
    }

    @NotNull
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m10799deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m10800deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_port, reason: not valid java name */
    public final int m10801deprecated_port() {
        return this.port;
    }

    @Nullable
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m10802deprecated_query() {
        return query();
    }

    @NotNull
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m10803deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m10804deprecated_querySize() {
        return querySize();
    }

    @NotNull
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m10805deprecated_scheme() {
        return this.scheme;
    }

    @NotNull
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m10806deprecated_uri() {
        return uri();
    }

    @NotNull
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m10807deprecated_url() {
        return url();
    }

    @NotNull
    /* renamed from: -deprecated_username, reason: not valid java name */
    public final String m10808deprecated_username() {
        return this.username;
    }

    @Nullable
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        int iM8380T = C2496v.m8380T(this.url, '#', 0, false, 6, null) + 1;
        String str = this.url;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(iM8380T);
        C2769l.m9240d(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @NotNull
    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int iM8380T = C2496v.m8380T(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1;
        int iM8380T2 = C2496v.m8380T(this.url, '@', 0, false, 6, null);
        String str = this.url;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(iM8380T, iM8380T2);
        C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @NotNull
    public final String encodedPath() {
        int iM8380T = C2496v.m8380T(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iM8380T, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str2.substring(iM8380T, iDelimiterOffset);
        C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @NotNull
    public final List<String> encodedPathSegments() {
        int iM8380T = C2496v.m8380T(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iM8380T, str.length());
        ArrayList arrayList = new ArrayList();
        while (iM8380T < iDelimiterOffset) {
            int i4 = iM8380T + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i4, iDelimiterOffset);
            String str2 = this.url;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = str2.substring(i4, iDelimiterOffset2);
            C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iM8380T = iDelimiterOffset2;
        }
        return arrayList;
    }

    @Nullable
    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iM8380T = C2496v.m8380T(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, '#', iM8380T, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str2.substring(iM8380T, iDelimiterOffset);
        C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @NotNull
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, ":@", length, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str2.substring(length, iDelimiterOffset);
        C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof HttpUrl) && C2769l.m9237a(((HttpUrl) obj).url, this.url);
    }

    @Nullable
    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @NotNull
    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @NotNull
    public final String password() {
        return this.password;
    }

    @NotNull
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    @Nullable
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    @Nullable
    public final String queryParameter(@NotNull String name) {
        C2769l.m9241e(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        C1032a c1032aM4827h = C1037f.m4827h(C1037f.m4828i(0, list.size()), 2);
        int iM4802a = c1032aM4827h.m4802a();
        int iM4803b = c1032aM4827h.m4803b();
        int iM4804c = c1032aM4827h.m4804c();
        if (iM4804c < 0 ? iM4802a >= iM4803b : iM4802a <= iM4803b) {
            while (!C2769l.m9237a(name, this.queryNamesAndValues.get(iM4802a))) {
                if (iM4802a != iM4803b) {
                    iM4802a += iM4804c;
                }
            }
            return this.queryNamesAndValues.get(iM4802a + 1);
        }
        return null;
    }

    @NotNull
    public final String queryParameterName(int i4) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i4 * 2);
        C2769l.m9239c(str);
        return str;
    }

    @NotNull
    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return C2724g0.m9091b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1032a c1032aM4827h = C1037f.m4827h(C1037f.m4828i(0, this.queryNamesAndValues.size()), 2);
        int iM4802a = c1032aM4827h.m4802a();
        int iM4803b = c1032aM4827h.m4803b();
        int iM4804c = c1032aM4827h.m4804c();
        if (iM4804c < 0 ? iM4802a >= iM4803b : iM4802a <= iM4803b) {
            while (true) {
                String str = this.queryNamesAndValues.get(iM4802a);
                C2769l.m9239c(str);
                linkedHashSet.add(str);
                if (iM4802a == iM4803b) {
                    break;
                }
                iM4802a += iM4804c;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        C2769l.m9240d(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @Nullable
    public final String queryParameterValue(int i4) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i4 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    public final List<String> queryParameterValues(@NotNull String name) {
        C2769l.m9241e(name, "name");
        if (this.queryNamesAndValues == null) {
            return C2730l.m9139f();
        }
        ArrayList arrayList = new ArrayList();
        C1032a c1032aM4827h = C1037f.m4827h(C1037f.m4828i(0, this.queryNamesAndValues.size()), 2);
        int iM4802a = c1032aM4827h.m4802a();
        int iM4803b = c1032aM4827h.m4803b();
        int iM4804c = c1032aM4827h.m4804c();
        if (iM4804c < 0 ? iM4802a >= iM4803b : iM4802a <= iM4803b) {
            while (true) {
                if (C2769l.m9237a(name, this.queryNamesAndValues.get(iM4802a))) {
                    arrayList.add(this.queryNamesAndValues.get(iM4802a + 1));
                }
                if (iM4802a == iM4803b) {
                    break;
                }
                iM4802a += iM4804c;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C2769l.m9240d(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        C2769l.m9239c(builderNewBuilder);
        return builderNewBuilder.username("").password("").build().toString();
    }

    @Nullable
    public final HttpUrl resolve(@NotNull String link) {
        C2769l.m9241e(link, "link");
        Builder builderNewBuilder = newBuilder(link);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public String toString() {
        return this.url;
    }

    @Nullable
    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    @NotNull
    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e4) {
            try {
                URI uriCreate = URI.create(new C2484j("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m8280d(string, ""));
                C2769l.m9240d(uriCreate, "try {\n        val stripp…e) // Unexpected!\n      }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    @NotNull
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e4) {
            throw new RuntimeException(e4);
        }
    }

    @NotNull
    public final String username() {
        return this.username;
    }

    @Nullable
    public final Builder newBuilder(@NotNull String link) {
        C2769l.m9241e(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
