.class public final Lcom/friday/cloudsnote/SophixStubApplication;
.super Lcom/taobao/sophix/SophixApplication;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/cloudsnote/SophixStubApplication$RealApplicationStub;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/taobao/sophix/SophixApplication;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(IILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/cloudsnote/SophixStubApplication;->initSophix$lambda$0(IILjava/lang/String;I)V

    return-void
.end method

.method private final initSophix()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/taobao/sophix/SophixManager;->getInstance()Lcom/taobao/sophix/SophixManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/taobao/sophix/SophixManager;->setContext(Landroid/app/Application;)Lcom/taobao/sophix/SophixManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/taobao/sophix/SophixManager;->setAppVersion(Ljava/lang/String;)Lcom/taobao/sophix/SophixManager;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "668636b36fafa95e1adfaeedf6eb6154"

    .line 29
    .line 30
    const-string v2, "MIIEugIBADANBgkqhkiG9w0BAQEFAASCBKQwggSgAgEAAoIBAQCT0BzWXGezmNtBSp3v33tjB5TY2eJcADYiOlfCoZ3kKqHUNJ/oU5gyl0fUrP4HwWPqNcVgGhQqYGV/8/zgObHQ3l7Ef6pxaIVMGUViBG2ziYD1H3lvLeYIWQNztZnFS3kelKnj7gP9fVaUK8Nagx0eEhDWuA/b5p4LyHQ0V1ItITnmoIydX1GMFg6ob9YH72QcwLDYMu5TDofl/uxDSytHXnjXoQTIYIocAqCBLbkX5hOn77KW4Jr5DBxQK28F28AGdCWJpjA9/Adxc3hrUJmqSDxIe8NcAWDgxQ0JAIGhn5Uv4SAIdvk3fpDsiy4pAJ38lpiIBjOn9HhHagJLpt8hAgMBAAECggEAdJNS2wEfzHZGndTigPdpka2+B9S3gMWt7ArFgjwCkZvJ69nhL9MWGvhS73nME4PDcEkeNG/87Xr/Mg3Up2b5RXjLlv/1BeJgFqdroCVL+6f7q9c556R0YqsJXO2hrAedK7Al2Ryzyu1aJhvpw23avgeTfjTGVTEp/rMGau1fYzU4gyZSs95AXXj7RTRsoooqsO1gfYYHzQBWWEgWkzmdc7RgXz+GCoB1Zob66J/32zFaIMBG1Y47YY1r2Ine05SY47YWEyVrPI8StkrmTMkCjJowU95mq3v25vhHtBApiO+3Zw3PU+tH8s2FSkXYnpjCQoo2mwYsio6jFzCjuE/X0QKBgQDR4GVQ19PsfMCxgPCN9ICnXTDURijENhUGqg3zTxOHC77y8GNAy+9FFCCcBKiRx6HjzI+lXoh97dKwL4ROT2cwTkF+sqpLjjPK++pPNhviig2z3WJHHI/86k0I+y1cUBopFZNFGClaCY3V37+rXzqHKKBuPiA9MSpkq05BbDuFRQKBgQC0TAiEQZmJ//pPrTJu7TJ+gT6Oz4MsAUmL+AzGFM+2MgkCYtiZ82fqBD2ZaCoT0/zHkDzkpFOmteHNxN4HXJF0SLBJq3mvVZBSWBkFCJLq6kxE/9TKgk3Ft+DUm8uKRc+xsmqM5biH03+OgnmV7xEyDC3y6MNomYhyllbyImjKLQKBgC4jHUKrX4wiVJ3w0XDzagDgzKYtkjKoDPE9Gvn8zTcnzt9LFxacfkn6RbzmjUQW1bDlPELHSEwepu1SVMx+ShnlaiJ3FlaruRkLThQBuhmP7bk3lq45SjH4M90gknUzqryTYJ+U0ypW5VY57MG4mn4x4Sq6/41ULJSa0AYzy9XdAn8j6wHHV0o/M7+qH9bsQlTM3vKXgL+hBKCiQchJrduzcERbNVXxVYxeEnozFY1MZe710sZOxm3jyFgzpgSVctuHTvPPuVmElIcr4GEbn5mlMwf+tvitX0gfG4Ku2Fq0MTQvMlwHtbwNUxUWTufp9rZ2QfblbXmAXRXRviGUG0bFAoGAHphKL+3NZGVmF8fhHRrlRirl0D5/URDAEWcOGDYHlsPbioIFALS+FIDaD0wqNRH422Kfew4ArQlrXYKN/5DODKp4Nd+7XyUlbuGlegGm8e42IQnC2rKY5e/glRYEu9xXHGXYOhT9UKJU+LrvfuuKTxc64gnY5cNQffvJlk6WFHk="

    .line 31
    .line 32
    const-string v4, "30927116-1"

    .line 33
    .line 34
    invoke-virtual {v0, v4, v1, v2}, Lcom/taobao/sophix/SophixManager;->setSecretMetaData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/taobao/sophix/SophixManager;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, v3}, Lcom/taobao/sophix/SophixManager;->setEnableDebug(Z)Lcom/taobao/sophix/SophixManager;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Lw1/j;

    .line 43
    .line 44
    invoke-direct {v1}, Lw1/j;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/taobao/sophix/SophixManager;->setPatchLoadStatusStub(Lcom/taobao/sophix/listener/PatchLoadStatusListener;)Lcom/taobao/sophix/SophixManager;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lcom/taobao/sophix/SophixManager;->initialize()V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/taobao/sophix/SophixManager;->getInstance()Lcom/taobao/sophix/SophixManager;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lcom/taobao/sophix/SophixManager;->queryAndLoadNewPatch()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private static final initSophix$lambda$0(IILjava/lang/String;I)V
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    const-string p2, "Sophix"

    .line 3
    .line 4
    if-eq p1, p0, :cond_1

    .line 5
    .line 6
    const/16 p0, 0xc

    .line 7
    .line 8
    if-eq p1, p0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "sophix preload patch success. restart app to make effect."

    .line 12
    .line 13
    invoke-static {p2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    const-string p0, "sophix load patch success!"

    .line 18
    .line 19
    invoke-static {p2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Landroidx/multidex/MultiDex;->install(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/friday/cloudsnote/SophixStubApplication;->initSophix()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
