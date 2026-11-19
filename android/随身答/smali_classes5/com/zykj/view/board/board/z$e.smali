.class public final Lcom/zykj/view/board/board/z$e;
.super Lcom/zykj/view/board/board/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final c:Lcom/zykj/view/board/board/z$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/z$e;

    invoke-direct {v0}, Lcom/zykj/view/board/board/z$e;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/z$e;->c:Lcom/zykj/view/board/board/z$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x3f99999a    # 1.2f

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/view/board/board/z;-><init>(IFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/view/board/board/z$e;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x6c8deb43

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Level4"

    return-object v0
.end method
