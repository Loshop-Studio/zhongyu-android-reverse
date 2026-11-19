.class public abstract Landroidx/compose/ui/modifier/ModifierLocal;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final defaultFactory:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lhd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/modifier/ModifierLocal;->defaultFactory:Lhd/a;

    return-void
.end method

.method public synthetic constructor <init>(Lhd/a;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/modifier/ModifierLocal;-><init>(Lhd/a;)V

    return-void
.end method


# virtual methods
.method public final getDefaultFactory$ui_release()Lhd/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/modifier/ModifierLocal;->defaultFactory:Lhd/a;

    .line 2
    .line 3
    return-object v0
.end method
