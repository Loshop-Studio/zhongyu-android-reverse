.class public final Lcom/zykj/view/board/board/PenColor$ColorRed;
.super Lcom/zykj/view/board/board/PenColor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/PenColor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ColorRed"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u00c6\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00d6\u0003J\t\u0010\u0008\u001a\u00020\tH\u00d6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/zykj/view/board/board/PenColor$ColorRed;",
        "Lcom/zykj/view/board/board/PenColor;",
        "<init>",
        "()V",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDataState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/PenColor$ColorRed\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,478:1\n404#2:479\n*S KotlinDebug\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/PenColor$ColorRed\n*L\n346#1:479\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/view/board/board/PenColor$ColorRed;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/PenColor$ColorRed;

    invoke-direct {v0}, Lcom/zykj/view/board/board/PenColor$ColorRed;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/PenColor$ColorRed;->INSTANCE:Lcom/zykj/view/board/board/PenColor$ColorRed;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    const-string v0, "#FF4931"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/view/board/board/PenColor;-><init>(IILkotlin/jvm/internal/e;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/view/board/board/PenColor$ColorRed;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x2e305824

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "ColorRed"

    return-object v0
.end method
