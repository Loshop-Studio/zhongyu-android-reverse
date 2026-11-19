.class public final Ls/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/g;


# static fields
.field public static final b:Lj/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ls/l;

    .line 2
    .line 3
    invoke-direct {v0}, Ls/l;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls/l;->b:Lj/g;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static c()Ls/l;
    .locals 1

    .line 1
    sget-object v0, Ls/l;->b:Lj/g;

    .line 2
    .line 3
    check-cast v0, Ls/l;

    .line 4
    .line 5
    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lm/j;II)Lm/j;
    .locals 0

    .line 1
    return-object p2
.end method

.method public b(Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    return-void
.end method
