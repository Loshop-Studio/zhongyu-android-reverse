.class public abstract Lcom/friday/common/entity/OssFileResource;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/entity/OssFileResource$Log;,
        Lcom/friday/common/entity/OssFileResource$Other;,
        Lcom/friday/common/entity/OssFileResource$Resource;
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final name:Ljava/lang/String;

.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/friday/common/entity/OssFileResource;->value:I

    iput-object p2, p0, Lcom/friday/common/entity/OssFileResource;->name:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/friday/common/entity/OssFileResource;-><init>(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OssFileResource;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/OssFileResource;->value:I

    .line 2
    .line 3
    return v0
.end method
