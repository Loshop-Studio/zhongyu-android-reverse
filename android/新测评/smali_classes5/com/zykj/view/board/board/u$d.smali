.class public final Lcom/zykj/view/board/board/u$d;
.super Lcom/zykj/view/board/board/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final c:Lcom/zykj/view/board/board/u$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/u$d;

    invoke-direct {v0}, Lcom/zykj/view/board/board/u$d;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/u$d;->c:Lcom/zykj/view/board/board/u$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/view/board/board/u;-><init>(IFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/view/board/board/u$d;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x6c8deb42

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Level3"

    return-object v0
.end method
