.class public final synthetic Lw8/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lw8/f0;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Lw8/f0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw8/e0;->a:I

    iput-object p2, p0, Lw8/e0;->b:Ljava/lang/String;

    iput-object p3, p0, Lw8/e0;->c:Lw8/f0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lw8/e0;->a:I

    iget-object v1, p0, Lw8/e0;->b:Ljava/lang/String;

    iget-object v2, p0, Lw8/e0;->c:Lw8/f0;

    invoke-static {v0, v1, v2}, Lw8/f0;->v(ILjava/lang/String;Lw8/f0;)[Lu8/f;

    move-result-object v0

    return-object v0
.end method
