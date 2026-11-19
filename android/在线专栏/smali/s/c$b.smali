.class public final Ls/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:[Ls/c$c;


# direct methods
.method public constructor <init>([Ls/c$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls/c$b;->a:[Ls/c$c;

    return-void
.end method


# virtual methods
.method public a()[Ls/c$c;
    .locals 1

    iget-object v0, p0, Ls/c$b;->a:[Ls/c$c;

    return-object v0
.end method
