.class public final Lx0/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field a:Ljava/util/concurrent/Executor;

.field b:Lx0/z;

.field c:Lx0/m;

.field d:Ljava/util/concurrent/Executor;

.field e:Lx0/t;

.field f:Lx0/k;

.field g:Ljava/lang/String;

.field h:I

.field i:I

.field j:I

.field k:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lx0/b$a;->h:I

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lx0/b$a;->i:I

    const v0, 0x7fffffff

    .line 4
    iput v0, p0, Lx0/b$a;->j:I

    const/16 v0, 0x14

    .line 5
    iput v0, p0, Lx0/b$a;->k:I

    return-void
.end method


# virtual methods
.method public a()Lx0/b;
    .locals 1

    new-instance v0, Lx0/b;

    invoke-direct {v0, p0}, Lx0/b;-><init>(Lx0/b$a;)V

    return-object v0
.end method
