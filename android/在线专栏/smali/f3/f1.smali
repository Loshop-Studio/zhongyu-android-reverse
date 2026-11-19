.class public final Lf3/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf3/h0;


# static fields
.field public static final a:Lf3/f1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf3/f1;

    invoke-direct {v0}, Lf3/f1;-><init>()V

    sput-object v0, Lf3/f1;->a:Lf3/f1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()Lq2/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lq2/h;->a:Lq2/h;

    return-object v0
.end method
