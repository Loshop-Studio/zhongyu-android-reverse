.class public final synthetic Lw8/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lw8/r1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lw8/r1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/p1;->a:Ljava/lang/String;

    iput-object p2, p0, Lw8/p1;->b:Lw8/r1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw8/p1;->a:Ljava/lang/String;

    iget-object v1, p0, Lw8/p1;->b:Lw8/r1;

    invoke-static {v0, v1}, Lw8/r1;->b(Ljava/lang/String;Lw8/r1;)Lu8/f;

    move-result-object v0

    return-object v0
.end method
