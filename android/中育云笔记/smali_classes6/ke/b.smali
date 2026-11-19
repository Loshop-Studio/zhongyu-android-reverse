.class public final synthetic Lke/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/o$c;


# instance fields
.field public final synthetic a:Lje/o;


# direct methods
.method public synthetic constructor <init>(Lje/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lke/b;->a:Lje/o;

    return-void
.end method


# virtual methods
.method public final a(Lje/e;)Lje/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lke/b;->a:Lje/o;

    invoke-static {v0, p1}, Lke/d;->a(Lje/o;Lje/e;)Lje/o;

    move-result-object p1

    return-object p1
.end method
