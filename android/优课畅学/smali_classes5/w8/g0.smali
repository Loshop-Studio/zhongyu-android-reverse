.class public final synthetic Lw8/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lw8/h0;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lw8/h0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/g0;->a:Lw8/h0;

    iput-object p2, p0, Lw8/g0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw8/g0;->a:Lw8/h0;

    iget-object v1, p0, Lw8/g0;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lw8/h0;->a(Lw8/h0;Ljava/lang/String;)Lu8/f;

    move-result-object v0

    return-object v0
.end method
