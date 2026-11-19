.class public final synthetic Lc2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/e;


# instance fields
.field public final synthetic a:Lc2/t;


# direct methods
.method public synthetic constructor <init>(Lc2/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/r;->a:Lc2/t;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lc2/r;->a:Lc2/t;

    invoke-static {v0, p1, p2}, Lc2/t;->e(Lc2/t;ILjava/lang/Throwable;)V

    return-void
.end method
