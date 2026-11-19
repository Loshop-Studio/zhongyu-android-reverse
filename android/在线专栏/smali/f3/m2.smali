.class public final Lf3/m2;
.super Lq2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf3/m2$a;
    }
.end annotation


# static fields
.field public static final b:Lf3/m2$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf3/m2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf3/m2$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lf3/m2;->b:Lf3/m2$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lf3/m2;->b:Lf3/m2$a;

    invoke-direct {p0, v0}, Lq2/a;-><init>(Lq2/g$c;)V

    return-void
.end method
