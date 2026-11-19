.class public final Lcom/zykj/view/board/board/BackgroundType$ColorGreen;
.super Lcom/zykj/view/board/board/BackgroundType;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/BackgroundType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ColorGreen"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u00c6\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00d6\u0003J\t\u0010\u0008\u001a\u00020\tH\u00d6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/zykj/view/board/board/BackgroundType$ColorGreen;",
        "Lcom/zykj/view/board/board/BackgroundType;",
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
        "SMAP\nDataState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$ColorGreen\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,478:1\n404#2:479\n*S KotlinDebug\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$ColorGreen\n*L\n453#1:479\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/view/board/board/BackgroundType$ColorGreen;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/BackgroundType$ColorGreen;

    invoke-direct {v0}, Lcom/zykj/view/board/board/BackgroundType$ColorGreen;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/BackgroundType$ColorGreen;->INSTANCE:Lcom/zykj/view/board/board/BackgroundType$ColorGreen;

    return-void
.end method

.method private constructor <init>()V
    .locals 9

    .line 1
    const-string v0, "#4C7068"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    const/16 v7, 0x1c

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    move-object v1, p0

    .line 15
    invoke-direct/range {v1 .. v8}, Lcom/zykj/view/board/board/BackgroundType;-><init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IFILkotlin/jvm/internal/e;)V

    .line 16
    .line 17
    .line 18
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
    instance-of p1, p1, Lcom/zykj/view/board/board/BackgroundType$ColorGreen;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0xfc47e70

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "ColorGreen"

    return-object v0
.end method
