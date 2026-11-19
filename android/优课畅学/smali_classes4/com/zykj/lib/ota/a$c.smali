.class public final Lcom/zykj/lib/ota/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/lib/ota/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/ota/a$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    const-string v0, "versionName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/lib/ota/a$a;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/zykj/lib/ota/a$a;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final b(Lcom/zykj/lib/ota/bean/VersionInfo;)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    const-string v0, "versionInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/lib/ota/a$b;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/zykj/lib/ota/a$b;-><init>(Lcom/zykj/lib/ota/bean/VersionInfo;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
