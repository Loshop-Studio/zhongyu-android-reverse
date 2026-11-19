.class public final Lcom/zykj/view/board/board/z$h;
.super Lcom/zykj/view/board/board/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# static fields
.field public static final c:Lcom/zykj/view/board/board/z$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/z$h;

    invoke-direct {v0}, Lcom/zykj/view/board/board/z$h;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/z$h;->c:Lcom/zykj/view/board/board/z$h;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x3fdef9db    # 1.742f

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x7

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
    instance-of p1, p1, Lcom/zykj/view/board/board/z$h;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x6c8deb46

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Level7"

    return-object v0
.end method
