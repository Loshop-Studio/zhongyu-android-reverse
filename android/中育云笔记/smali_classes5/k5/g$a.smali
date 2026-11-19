.class public Lk5/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/g;->c(Lm5/c;Ljava/lang/String;Li5/c;I)Lk5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lm5/c;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Li5/c;

.field public final synthetic d:Lk5/g;


# direct methods
.method public constructor <init>(Lk5/g;Lm5/c;Ljava/lang/String;Li5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/g$a;->d:Lk5/g;

    .line 2
    .line 3
    iput-object p2, p0, Lk5/g$a;->a:Lm5/c;

    .line 4
    .line 5
    iput-object p3, p0, Lk5/g$a;->b:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lk5/g$a;->c:Li5/c;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Lk5/d;
    .locals 4

    .line 1
    new-instance v0, Lk5/c;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/g$a;->a:Lm5/c;

    .line 4
    .line 5
    iget-object v2, p0, Lk5/g$a;->d:Lk5/g;

    .line 6
    .line 7
    invoke-static {v2}, Lk5/g;->a(Lk5/g;)Li5/a;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, v2}, Lk5/c;-><init>(Lm5/c;Li5/a;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lk5/g;->b()Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lk5/g$a;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v3, p0, Lk5/g$a;->c:Li5/c;

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2, v3}, Lk5/c;->b(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;Li5/c;)Lk5/d;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk5/g$a;->a()Lk5/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
