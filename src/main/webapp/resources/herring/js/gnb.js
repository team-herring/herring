(function (window, $) {
    $('a[data-toggle=popover]').popover({
        placement: 'bottom',
        trigger: 'hover focus',
        container: 'body'
    });
})(window, jQuery);