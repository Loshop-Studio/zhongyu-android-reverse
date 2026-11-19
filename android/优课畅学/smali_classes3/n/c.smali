.class public abstract Ln/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln/c;

.field public static final b:Ln/c;

.field public static final c:Ln/c;

.field public static final d:Ln/c;

.field public static final e:Ln/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ln/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ln/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln/c;->a:Ln/c;

    .line 7
    .line 8
    new-instance v0, Ln/c$b;

    .line 9
    .line 10
    invoke-direct {v0}, Ln/c$b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ln/c;->b:Ln/c;

    .line 14
    .line 15
    new-instance v0, Ln/c$c;

    .line 16
    .line 17
    invoke-direct {v0}, Ln/c$c;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Ln/c;->c:Ln/c;

    .line 21
    .line 22
    new-instance v0, Ln/c$d;

    .line 23
    .line 24
    invoke-direct {v0}, Ln/c$d;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Ln/c;->d:Ln/c;

    .line 28
    .line 29
    new-instance v0, Ln/c$e;

    .line 30
    .line 31
    invoke-direct {v0}, Ln/c$e;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Ln/c;->e:Ln/c;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b()Z
.end method

.method public abstract c(Lcom/bumptech/glide/load/DataSource;)Z
.end method

.method public abstract d(ZLcom/bumptech/glide/load/DataSource;Lcom/bumptech/glide/load/EncodeStrategy;)Z
.end method
