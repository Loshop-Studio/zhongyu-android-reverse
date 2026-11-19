.class public final synthetic Lp0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/a;


# static fields
.field public static final synthetic a:Lp0/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lp0/d;

    invoke-direct {v0}, Lp0/d;-><init>()V

    sput-object v0, Lp0/d;->a:Lp0/d;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls0/f;

    invoke-interface {p1}, Ls0/f;->i()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
