package com.tencent.liteav.txcvodplayer.p054a;

import android.net.Uri;
import android.util.Log;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.File;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* renamed from: com.tencent.liteav.txcvodplayer.a.b */
/* loaded from: classes4.dex */
public class C6706b {

    /* renamed from: a */
    private static final String f6301a = "b";

    /* renamed from: b */
    private static C6706b f6302b = new C6706b();

    /* renamed from: c */
    private ArrayList<a> f6303c;

    /* renamed from: d */
    private HashSet<a> f6304d;

    /* renamed from: e */
    private String f6305e;

    /* renamed from: f */
    private int f6306f;

    /* renamed from: g */
    private String f6307g;

    /* renamed from: com.tencent.liteav.txcvodplayer.a.b$a */
    public static class a implements Serializable {
        String fileType;
        String path;
        Long time;
        String url;

        /* renamed from: a */
        public String m5640a() {
            return this.url;
        }

        /* renamed from: b */
        public String m5643b() {
            return this.path;
        }

        /* renamed from: c */
        public Long m5645c() {
            return this.time;
        }

        /* renamed from: d */
        public String m5647d() {
            String str;
            if (this.fileType == null && (str = this.path) != null) {
                if (str.endsWith("mp4")) {
                    return "mp4";
                }
                if (this.path.endsWith("m3u8.sqlite")) {
                    return IjkMediaMeta.IJKM_KEY_M3U8;
                }
            }
            return this.fileType;
        }

        /* renamed from: a */
        public void m5642a(String str) {
            this.url = str;
        }

        /* renamed from: b */
        public void m5644b(String str) {
            this.path = str;
        }

        /* renamed from: c */
        public void m5646c(String str) {
            this.fileType = str;
        }

        /* renamed from: a */
        public void m5641a(Long l10) {
            this.time = l10;
        }
    }

    /* renamed from: a */
    public static C6706b m5623a() {
        return f6302b;
    }

    /* renamed from: g */
    public static String m5628g(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b10 : bArrDigest) {
                int i10 = b10 & 255;
                if (i10 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i10));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public void m5633b(String str) {
        String strConcat = str.endsWith("/") ? str.concat("txvodcache") : str.concat("/txvodcache");
        String str2 = this.f6305e;
        if (str2 == null || !str2.equals(strConcat)) {
            this.f6305e = strConcat;
            if (strConcat == null) {
                return;
            }
            new File(this.f6305e).mkdirs();
            if (m5634b()) {
                return;
            }
            m5627e();
        }
    }

    /* renamed from: c */
    public String m5635c(String str) {
        int iIndexOf;
        int iIndexOf2 = str.indexOf("voddrm.token.");
        if (iIndexOf2 > -1 && (iIndexOf = str.indexOf(".", iIndexOf2 + 13)) > -1 && iIndexOf < str.length() - 1) {
            str = str.substring(0, iIndexOf2) + str.substring(iIndexOf + 1);
        }
        int iIndexOf3 = str.indexOf("?");
        return iIndexOf3 > -1 ? str.substring(0, iIndexOf3) : str;
    }

    /* renamed from: e */
    public boolean m5638e(String str) {
        Uri uri = Uri.parse(str);
        if (uri == null || uri.getPath() == null || uri.getScheme() == null || !uri.getScheme().startsWith("http")) {
            return false;
        }
        return uri.getPath().endsWith(".mp4") || uri.getPath().endsWith(IjkMediaMeta.IJKM_KEY_M3U8) || uri.getPath().endsWith(".MP4") || uri.getPath().endsWith("M3U8");
    }

    /* renamed from: f */
    public a m5639f(String str) throws TransformerException, DOMException {
        a aVar = new a();
        aVar.url = str;
        aVar.time = Long.valueOf(System.currentTimeMillis());
        String strM5628g = m5628g(str);
        Uri uri = Uri.parse(str);
        if (uri.getPath().endsWith(".mp4") || uri.getPath().endsWith(".MP4")) {
            if (this.f6307g != null) {
                aVar.m5644b(strM5628g + "." + this.f6307g);
            } else {
                aVar.m5644b(strM5628g + ".mp4");
            }
            aVar.m5646c("mp4");
        } else {
            if (!uri.getPath().endsWith(".m3u8") && !uri.getPath().endsWith(".M3U8")) {
                return null;
            }
            aVar.m5644b(strM5628g + ".m3u8.sqlite");
            aVar.m5646c(IjkMediaMeta.IJKM_KEY_M3U8);
        }
        this.f6303c.add(aVar);
        m5636c();
        return aVar;
    }

    /* renamed from: a */
    public void m5629a(int i10) {
        this.f6306f = i10;
    }

    /* renamed from: d */
    public C6705a m5637d(String str) throws TransformerException, DOMException {
        if (this.f6305e != null && str != null) {
            String strM5635c = m5635c(str);
            File file = new File(this.f6305e);
            if (!file.mkdirs() && !file.isDirectory()) {
                return null;
            }
            Iterator<a> it = this.f6303c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.url.equals(strM5635c)) {
                    m5630a(next);
                    this.f6304d.add(next);
                    return new C6705a(next.path, this.f6305e, next.fileType);
                }
            }
            Iterator<a> it2 = this.f6303c.iterator();
            while (it2.hasNext() && this.f6303c.size() > this.f6306f) {
                a next2 = it2.next();
                if (!this.f6304d.contains(next2)) {
                    m5625b(next2);
                    it2.remove();
                }
            }
            a aVarM5639f = m5639f(strM5635c);
            if (aVarM5639f != null) {
                this.f6304d.add(aVarM5639f);
                return new C6705a(aVarM5639f.path, this.f6305e, aVarM5639f.fileType);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m5631a(String str) {
        this.f6307g = str;
    }

    /* renamed from: a */
    public void m5630a(a aVar) throws TransformerException, DOMException {
        aVar.time = Long.valueOf(System.currentTimeMillis());
        this.f6303c.remove(aVar);
        this.f6303c.add(aVar);
        m5636c();
    }

    /* renamed from: e */
    private void m5627e() {
        if (new File(this.f6305e).listFiles().length > 0) {
            Log.w(f6301a, "!!!Warning: TXVodPlayer cache directory is not empty " + this.f6305e + "!!!");
        }
    }

    /* renamed from: a */
    private void m5624a(String str, final String str2) {
        final String str3 = this.f6305e + "/" + str;
        new Thread(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                new File(str3).delete();
                if (str2.equals("mp4")) {
                    new File(str3.concat(".info")).delete();
                }
                Log.w(C6706b.f6301a, "delete " + str3);
            }
        }, "vodCacheMgrDelfile").start();
    }

    /* renamed from: c */
    public void m5636c() throws TransformerException, DOMException {
        try {
            Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element elementCreateElement = documentNewDocument.createElement("caches");
            documentNewDocument.appendChild(elementCreateElement);
            Iterator<a> it = this.f6303c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                Element elementCreateElement2 = documentNewDocument.createElement("cache");
                elementCreateElement.appendChild(elementCreateElement2);
                Element elementCreateElement3 = documentNewDocument.createElement("path");
                elementCreateElement3.appendChild(documentNewDocument.createTextNode(next.m5643b()));
                elementCreateElement2.appendChild(elementCreateElement3);
                Element elementCreateElement4 = documentNewDocument.createElement("time");
                elementCreateElement4.appendChild(documentNewDocument.createTextNode(next.m5645c().toString()));
                elementCreateElement2.appendChild(elementCreateElement4);
                Element elementCreateElement5 = documentNewDocument.createElement(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
                elementCreateElement5.appendChild(documentNewDocument.createTextNode(next.m5640a()));
                elementCreateElement2.appendChild(elementCreateElement5);
                Element elementCreateElement6 = documentNewDocument.createElement("fileType");
                elementCreateElement6.appendChild(documentNewDocument.createTextNode(next.m5647d()));
                elementCreateElement2.appendChild(elementCreateElement6);
            }
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            DOMSource dOMSource = new DOMSource(documentNewDocument);
            StreamResult streamResult = new StreamResult();
            streamResult.setSystemId(new File(this.f6305e, "tx_cache.xml").getAbsolutePath());
            transformerNewTransformer.transform(dOMSource, streamResult);
            System.out.println("File saved!");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: b */
    public boolean m5634b() {
        this.f6303c = new ArrayList<>();
        this.f6304d = new HashSet<>();
        try {
            for (Node firstChild = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(this.f6305e + "/tx_cache.xml")).getElementsByTagName("caches").item(0).getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                a aVar = new a();
                for (Node firstChild2 = firstChild.getFirstChild(); firstChild2 != null; firstChild2 = firstChild2.getNextSibling()) {
                    if (firstChild2.getNodeName().equals("path")) {
                        aVar.m5644b(firstChild2.getFirstChild().getNodeValue());
                    } else if (firstChild2.getNodeName().equals("time")) {
                        aVar.m5641a(Long.valueOf(Long.parseLong(firstChild2.getFirstChild().getNodeValue())));
                    } else if (firstChild2.getNodeName().equals(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL)) {
                        aVar.m5642a(firstChild2.getFirstChild().getNodeValue());
                    } else if (firstChild2.getNodeName().equals("fileType")) {
                        aVar.m5646c(firstChild2.getFirstChild().getNodeValue());
                    }
                }
                this.f6303c.add(aVar);
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    /* renamed from: a */
    public void m5632a(String str, boolean z10) throws TransformerException, DOMException {
        Iterator<a> it = this.f6304d.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.m5643b().equals(str)) {
                it.remove();
                if (z10) {
                    m5625b(next);
                    this.f6303c.remove(next);
                    m5636c();
                }
            }
        }
    }

    /* renamed from: b */
    private void m5625b(a aVar) {
        m5624a(aVar.m5643b(), aVar.m5647d());
    }
}
