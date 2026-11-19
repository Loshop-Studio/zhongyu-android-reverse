.class public final synthetic Lr9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lr9/i$b$a;

.field public final synthetic b:Lr9/f;

.field public final synthetic c:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lr9/i$b$a;Lr9/f;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/k;->a:Lr9/i$b$a;

    iput-object p2, p0, Lr9/k;->b:Lr9/f;

    iput-object p3, p0, Lr9/k;->c:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr9/k;->a:Lr9/i$b$a;

    iget-object v1, p0, Lr9/k;->b:Lr9/f;

    iget-object v2, p0, Lr9/k;->c:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, Lr9/i$b$a;->c(Lr9/i$b$a;Lr9/f;Ljava/lang/Throwable;)V

    return-void
.end method
