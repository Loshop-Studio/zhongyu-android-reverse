.class public final synthetic Landroidx/navigation/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/navigation/NavDeepLink;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavDeepLink;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/navigation/g;->a:I

    iput-object p1, p0, Landroidx/navigation/g;->b:Landroidx/navigation/NavDeepLink;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/navigation/g;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/navigation/g;->b:Landroidx/navigation/NavDeepLink;

    invoke-static {v0}, Landroidx/navigation/NavDeepLink;->e(Landroidx/navigation/NavDeepLink;)Lkotlin/text/Regex;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Landroidx/navigation/g;->b:Landroidx/navigation/NavDeepLink;

    invoke-static {v0}, Landroidx/navigation/NavDeepLink;->f(Landroidx/navigation/NavDeepLink;)Lkotlin/text/Regex;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Landroidx/navigation/g;->b:Landroidx/navigation/NavDeepLink;

    invoke-static {v0}, Landroidx/navigation/NavDeepLink;->b(Landroidx/navigation/NavDeepLink;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Landroidx/navigation/g;->b:Landroidx/navigation/NavDeepLink;

    invoke-static {v0}, Landroidx/navigation/NavDeepLink;->g(Landroidx/navigation/NavDeepLink;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Landroidx/navigation/g;->b:Landroidx/navigation/NavDeepLink;

    invoke-static {v0}, Landroidx/navigation/NavDeepLink;->i(Landroidx/navigation/NavDeepLink;)Lkotlin/Pair;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Landroidx/navigation/g;->b:Landroidx/navigation/NavDeepLink;

    invoke-static {v0}, Landroidx/navigation/NavDeepLink;->a(Landroidx/navigation/NavDeepLink;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Landroidx/navigation/g;->b:Landroidx/navigation/NavDeepLink;

    invoke-static {v0}, Landroidx/navigation/NavDeepLink;->c(Landroidx/navigation/NavDeepLink;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Landroidx/navigation/g;->b:Landroidx/navigation/NavDeepLink;

    invoke-static {v0}, Landroidx/navigation/NavDeepLink;->d(Landroidx/navigation/NavDeepLink;)Lkotlin/text/Regex;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
