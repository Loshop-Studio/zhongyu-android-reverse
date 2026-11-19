.class public final synthetic Ldf/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Ldf/i$b$a;

.field public final synthetic d:Ldf/f;

.field public final synthetic e:Ldf/c0;


# direct methods
.method public synthetic constructor <init>(Ldf/i$b$a;Ldf/f;Ldf/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/j;->c:Ldf/i$b$a;

    iput-object p2, p0, Ldf/j;->d:Ldf/f;

    iput-object p3, p0, Ldf/j;->e:Ldf/c0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldf/j;->c:Ldf/i$b$a;

    iget-object v1, p0, Ldf/j;->d:Ldf/f;

    iget-object v2, p0, Ldf/j;->e:Ldf/c0;

    invoke-static {v0, v1, v2}, Ldf/i$b$a;->d(Ldf/i$b$a;Ldf/f;Ldf/c0;)V

    return-void
.end method
