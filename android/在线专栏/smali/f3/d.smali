.class final Lf3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf3/a2;


# static fields
.field public static final a:Lf3/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf3/d;

    invoke-direct {v0}, Lf3/d;-><init>()V

    sput-object v0, Lf3/d;->a:Lf3/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "Active"

    return-object v0
.end method
