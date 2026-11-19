.class public Lj0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/a$b;


# instance fields
.field public final a:Lh0/a;

.field public final b:Ljava/lang/Object;

.field public final c:Lh0/e;


# direct methods
.method public constructor <init>(Lh0/a;Ljava/lang/Object;Lh0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj0/b;->a:Lh0/a;

    .line 5
    .line 6
    iput-object p2, p0, Lj0/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lj0/b;->c:Lh0/e;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lj0/b;->a:Lh0/a;

    .line 2
    .line 3
    iget-object v1, p0, Lj0/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lj0/b;->c:Lh0/e;

    .line 6
    .line 7
    invoke-interface {v0, v1, p1, v2}, Lh0/a;->a(Ljava/lang/Object;Ljava/io/File;Lh0/e;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
