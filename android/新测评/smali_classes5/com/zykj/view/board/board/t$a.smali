.class public final Lcom/zykj/view/board/board/t$a;
.super Lcom/zykj/view/board/board/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final f:Lcom/zykj/view/board/board/t$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/t$a;

    invoke-direct {v0}, Lcom/zykj/view/board/board/t$a;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/t$a;->f:Lcom/zykj/view/board/board/t$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    sget v1, Lcom/zykj/view/R$drawable;->view_icon_record_resume2:I

    .line 2
    .line 3
    const/16 v6, 0x18

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    move-object v0, p0

    .line 11
    invoke-direct/range {v0 .. v7}, Lcom/zykj/view/board/board/t;-><init>(IZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/view/board/board/t$a;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0xfdd7064

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Continue"

    return-object v0
.end method
