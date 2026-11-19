.class public final Lf3/m1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq2/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf3/m1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq2/g$c<",
        "Lf3/m1;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic a:Lf3/m1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf3/m1$b;

    invoke-direct {v0}, Lf3/m1$b;-><init>()V

    sput-object v0, Lf3/m1$b;->a:Lf3/m1$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
