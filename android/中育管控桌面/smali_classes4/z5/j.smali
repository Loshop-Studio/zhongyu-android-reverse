.class public final synthetic Lz5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz5/i$b$a;

.field public final synthetic b:Lz5/f;

.field public final synthetic c:Lz5/c0;


# direct methods
.method public synthetic constructor <init>(Lz5/i$b$a;Lz5/f;Lz5/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/j;->a:Lz5/i$b$a;

    iput-object p2, p0, Lz5/j;->b:Lz5/f;

    iput-object p3, p0, Lz5/j;->c:Lz5/c0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz5/j;->a:Lz5/i$b$a;

    iget-object v1, p0, Lz5/j;->b:Lz5/f;

    iget-object v2, p0, Lz5/j;->c:Lz5/c0;

    invoke-static {v0, v1, v2}, Lz5/i$b$a;->d(Lz5/i$b$a;Lz5/f;Lz5/c0;)V

    return-void
.end method
